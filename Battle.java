import java.util.ArrayList;
import java.util.Scanner;

public class Battle {
    private Scanner sc;
    private BattleScreen screen;

    public Battle(Scanner sc) {
        this.sc = sc;
    }

    public void start(Pokemon player, Pokemon enemy) {
        player.fullHeal();
        enemy.fullHeal();

        screen = new BattleScreen(sc, true);

        screen.showBattleMessage(player, enemy,
                "========== BATTLE START ==========\n" +
                        player.name.toUpperCase() + " Lv" + player.level + " vs " + enemy.name.toUpperCase() + " Lv" + enemy.level);

        int turn = 1;
        while (!player.isFainted() && !enemy.isFainted()) {

            int mainChoice = screen.showMainMenu(player, enemy);

            Move pm = null;

            if (mainChoice == 1) {
                int moveChoice = screen.showMoveMenu(player, enemy);
                if (moveChoice == -1) continue;
                pm = player.getMove(moveChoice - 1);
            } else if (mainChoice == 2) {
                screen.showSwitchMenu(player, enemy);
                continue;
            } else if (mainChoice == 3) {
                screen.showBagMenu(player, enemy);
                continue;
            } else if (mainChoice == 4) {
                screen.showBattleMessage(player, enemy, "Got away safely!");
                break;
            }

            if (pm == null) continue;

            Move em = chooseEnemyMove(enemy);
            if (em == null) break;

            int ps = (player.status == MoveCondition.PARALYSIS) ? player.getEffectiveSpd() / 2 : player.getEffectiveSpd();
            int es = (enemy.status == MoveCondition.PARALYSIS) ? enemy.getEffectiveSpd() / 2 : enemy.getEffectiveSpd();

            Pokemon first, second;
            Move fm, sm;

            if (ps > es || (ps == es && pm.getPriority() > em.getPriority()) ||
                    (ps == es && pm.getPriority() == em.getPriority() && Math.random() < 0.5)) {
                first = player; fm = pm; second = enemy; sm = em;
            } else {
                first = enemy; fm = em; second = player; sm = pm;
            }

            screen.showBattleMessage(player, enemy, first.name + " used " + fm.getName() + "!");
            execute(first, fm, second, player, enemy);
            if (second.isFainted()) {
                screen.showBattleMessage(player, enemy, second.name + " fainted!");
                break;
            }

            if (!second.flinched) {
                screen.showBattleMessage(player, enemy, second.name + " used " + sm.getName() + "!");
                execute(second, sm, first, player, enemy);
            } else {
                screen.showBattleMessage(player, enemy, second.name + " flinched!");
                second.flinched = false;
            }

            if (first.isFainted()) {
                screen.showBattleMessage(player, enemy, first.name + " fainted!");
                break;
            }

            endTurn(player, enemy);
            turn++;
        }

        if (player.isFainted()) {
            screen.showBattleMessage(player, enemy, "You lost...\n========== BATTLE END ==========");
        } else if (enemy.isFainted()) {
            int expGain = enemy.level * 10 + 20;
            boolean leveled = player.gainExp(expGain);
            String msg = "You won!\n" + player.name + " gained " + expGain + " EXP!";
            if (leveled) msg += "\n" + player.name + " grew to level " + player.level + "!";
            screen.showBattleMessage(player, enemy, msg + "\n========== BATTLE END ==========");
        }
    }

    // ============================================================
    // BOT DO RIVAL - PRIORIZA ATAQUE (90% ataque / 10% status)
    // ============================================================
    private Move chooseEnemyMove(Pokemon p) {
        ArrayList<Move> attackMoves = new ArrayList<>();
        ArrayList<Move> statusMoves = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Move m = p.getMove(i);
            if (m != null && m.hasPP()) {
                if (m.getPower() > 0) {
                    attackMoves.add(m);
                } else {
                    statusMoves.add(m);
                }
            }
        }

        // Se tiver move de ataque, 90% de chance de usar um
        if (!attackMoves.isEmpty()) {
            if (Math.random() < 0.9) {
                return attackMoves.get((int)(Math.random() * attackMoves.size()));
            }
        }

        // Se não tiver ataque ou cair nos 10%, tenta status
        if (!statusMoves.isEmpty()) {
            return statusMoves.get((int)(Math.random() * statusMoves.size()));
        }

        // Se não tiver nada, retorna null
        return null;
    }

    private void execute(Pokemon atk, Move move, Pokemon def, Pokemon player, Pokemon enemy) {
        move.usePP();

        if (move.getPower() == 0) {
            applyStatus(atk, move, def, player, enemy);
            return;
        }

        if (!move.hits()) {
            screen.showBattleMessage(player, enemy, "But it missed!");
            return;
        }

        double lvl = (2.0 * atk.level / 5.0 + 2);
        double ratio = (double) atk.getEffectiveAtk() / def.getEffectiveDef();
        double base = (lvl * move.getPower() * ratio) / 50.0 + 2;
        double typeM = TypeChart.getFinalMultiplier(move.getType(), def.type1, def.type2);
        double stab = (move.getType() == atk.type1 || move.getType() == atk.type2) ? 1.5 : 1.0;
        double rng = 0.85 + Math.random() * 0.15;
        double burn = (atk.status == MoveCondition.BURN) ? 0.5 : 1.0;

        int dmg = (int) (base * typeM * stab * rng * burn);
        if (typeM > 0 && dmg < 1) dmg = 1;
        if (typeM == 0) dmg = 0;

        def.takeDamage(dmg);
        String msg = def.name + " took " + dmg + " damage!";
        String typeMsg = TypeChart.getBattleMessage(typeM);
        if (!typeMsg.isEmpty()) msg += "\n" + typeMsg;
        screen.showBattleMessage(player, enemy, msg);

        if (move.appliesCondition()) applyStatus(atk, move, def, player, enemy);

        if (move.getCondition() == MoveCondition.RECOIL) {
            int rec = (int) (dmg * move.getConditionMagnitude() / 100.0);
            atk.takeDamage(rec);
            screen.showBattleMessage(player, enemy, atk.name + " took " + rec + " recoil damage!");
        }
    }

    private void applyStatus(Pokemon atk, Move move, Pokemon def, Pokemon player, Pokemon enemy) {
        switch (move.getCondition()) {
            case STAT_ATTACK_UP:
                atk.modifyAtk(move.getConditionMagnitude());
                screen.showBattleMessage(player, enemy, atk.name + "'s Attack rose!");
                break;
            case STAT_ATTACK_DOWN:
                def.modifyAtk(-move.getConditionMagnitude());
                screen.showBattleMessage(player, enemy, def.name + "'s Attack fell!");
                break;
            case STAT_DEFENSE_UP:
                atk.modifyDef(move.getConditionMagnitude());
                screen.showBattleMessage(player, enemy, atk.name + "'s Defense rose!");
                break;
            case STAT_DEFENSE_DOWN:
                def.modifyDef(-move.getConditionMagnitude());
                screen.showBattleMessage(player, enemy, def.name + "'s Defense fell!");
                break;
            case STAT_SPEED_UP:
                atk.modifySpd(move.getConditionMagnitude());
                screen.showBattleMessage(player, enemy, atk.name + "'s Speed rose!");
                break;
            case STAT_SPEED_DOWN:
                def.modifySpd(-move.getConditionMagnitude());
                screen.showBattleMessage(player, enemy, def.name + "'s Speed fell!");
                break;
            case STAT_ACCURACY_DOWN:
                def.modifyAccuracy(-move.getConditionMagnitude());
                screen.showBattleMessage(player, enemy, def.name + "'s Accuracy fell!");
                break;
            case STAT_EVASION_DOWN:
                def.modifyEvasion(-move.getConditionMagnitude());
                screen.showBattleMessage(player, enemy, def.name + "'s Evasion fell!");
                break;
            case BURN:
                if (def.status == MoveCondition.NONE) {
                    def.status = MoveCondition.BURN;
                    screen.showBattleMessage(player, enemy, def.name + " was burned!");
                }
                break;
            case PARALYSIS:
                if (def.status == MoveCondition.NONE) {
                    def.status = MoveCondition.PARALYSIS;
                    screen.showBattleMessage(player, enemy, def.name + " is paralyzed!");
                }
                break;
            case POISON:
                if (def.status == MoveCondition.NONE) {
                    def.status = MoveCondition.POISON;
                    screen.showBattleMessage(player, enemy, def.name + " was poisoned!");
                }
                break;
            case FREEZE:
                if (def.status == MoveCondition.NONE) {
                    def.status = MoveCondition.FREEZE;
                    screen.showBattleMessage(player, enemy, def.name + " was frozen solid!");
                }
                break;
            case SLEEP:
                if (def.status == MoveCondition.NONE) {
                    def.status = MoveCondition.SLEEP;
                    def.sleepTurns = 2 + (int) (Math.random() * 2);
                    screen.showBattleMessage(player, enemy, def.name + " fell asleep!");
                }
                break;
            case CONFUSION:
                if (def.confusionTurns == 0) {
                    def.confusionTurns = 2 + (int) (Math.random() * 3);
                    screen.showBattleMessage(player, enemy, def.name + " became confused!");
                }
                break;
            case FLINCH:
                def.flinched = true;
                break;
            case HEAL:
                int h = (int) (atk.calcMaxHp() * move.getConditionMagnitude() / 100.0);
                atk.heal(h);
                screen.showBattleMessage(player, enemy, atk.name + " recovered " + h + " HP!");
                break;
            default:
                break;
        }
    }

    private void endTurn(Pokemon player, Pokemon enemy) {
        if (player.isFainted() || enemy.isFainted()) return;

        if (player.status == MoveCondition.BURN) {
            int d = player.calcMaxHp() / 8;
            player.takeDamage(d);
            screen.showBattleMessage(player, enemy, player.name + " was hurt by burn! (-" + d + ")");
        }
        if (player.status == MoveCondition.POISON) {
            int d = player.calcMaxHp() / 8;
            player.takeDamage(d);
            screen.showBattleMessage(player, enemy, player.name + " was hurt by poison! (-" + d + ")");
        }
        if (player.status == MoveCondition.SLEEP) {
            player.sleepTurns--;
            if (player.sleepTurns <= 0) {
                player.status = MoveCondition.NONE;
                screen.showBattleMessage(player, enemy, player.name + " woke up!");
            } else {
                screen.showBattleMessage(player, enemy, player.name + " is fast asleep...");
            }
        }
        if (player.confusionTurns > 0) {
            player.confusionTurns--;
            if (player.confusionTurns <= 0) {
                screen.showBattleMessage(player, enemy, player.name + " snapped out of confusion!");
            }
        }

        if (enemy.status == MoveCondition.BURN) {
            int d = enemy.calcMaxHp() / 8;
            enemy.takeDamage(d);
            screen.showBattleMessage(player, enemy, enemy.name + " was hurt by burn! (-" + d + ")");
        }
        if (enemy.status == MoveCondition.POISON) {
            int d = enemy.calcMaxHp() / 8;
            enemy.takeDamage(d);
            screen.showBattleMessage(player, enemy, enemy.name + " was hurt by poison! (-" + d + ")");
        }
        if (enemy.status == MoveCondition.SLEEP) {
            enemy.sleepTurns--;
            if (enemy.sleepTurns <= 0) {
                enemy.status = MoveCondition.NONE;
                screen.showBattleMessage(player, enemy, enemy.name + " woke up!");
            } else {
                screen.showBattleMessage(player, enemy, enemy.name + " is fast asleep...");
            }
        }
        if (enemy.confusionTurns > 0) {
            enemy.confusionTurns--;
            if (enemy.confusionTurns <= 0) {
                screen.showBattleMessage(player, enemy, enemy.name + " snapped out of confusion!");
            }
        }
    }
}