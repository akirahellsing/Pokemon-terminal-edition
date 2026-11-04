import java.util.ArrayList;
import java.util.Scanner;

public class WildBattle {
    private Scanner sc;
    private BattleScreen screen;
    private Player player;

    public WildBattle(Scanner sc, Player player) {
        this.sc = sc;
        this.player = player;
    }

    public void start(Pokemon wildPokemon) {
        Pokemon playerPokemon = player.getFirstPokemon();
        if (playerPokemon == null) {
            System.out.println("No Pokemon available!");
            return;
        }

        wildPokemon.fullHeal();

        screen = new BattleScreen(sc, false); // false = wild battle, can run

        screen.showBattleMessage(playerPokemon, wildPokemon,
                "A wild " + wildPokemon.name.toUpperCase() + " appeared!\n" +
                        "Lv" + wildPokemon.level + " " + wildPokemon.name.toUpperCase());

        while (!playerPokemon.isFainted() && !wildPokemon.isFainted()) {
            int mainChoice = screen.showMainMenu(playerPokemon, wildPokemon);

            if (mainChoice == 1) { // BATTLE
                int moveChoice = screen.showMoveMenu(playerPokemon, wildPokemon);
                if (moveChoice == -1) continue;
                Move pm = playerPokemon.getMove(moveChoice - 1);
                if (pm == null || !pm.hasPP()) continue;

                Move em = chooseWildMove(wildPokemon);
                if (em == null) {
                    screen.showBattleMessage(playerPokemon, wildPokemon, wildPokemon.name + " has no moves left!");
                    break;
                }

                executeTurn(playerPokemon, pm, wildPokemon, em);

            } else if (mainChoice == 2) { // POKÉMON
                screen.showSwitchMenu(playerPokemon, wildPokemon);
                continue;

            } else if (mainChoice == 3) { // ITEMS
                int bagChoice = screen.showBagMenuWithItems(playerPokemon, wildPokemon, player.bag);
                if (bagChoice == 1) { // Poke Ball
                    boolean caught = attemptCatch(wildPokemon, playerPokemon);
                    if (caught) {
                        return;
                    }
                    // If not caught, wild Pokemon attacks
                    Move em = chooseWildMove(wildPokemon);
                    if (em != null) {
                        executeEnemyMove(wildPokemon, em, playerPokemon);
                    }
                }
                continue;

            } else if (mainChoice == 4) { // RUN
                screen.showBattleMessage(playerPokemon, wildPokemon, "Got away safely!");
                return;
            }
        }

        if (playerPokemon.isFainted()) {
            screen.showBattleMessage(playerPokemon, wildPokemon,
                    playerPokemon.name + " fainted!\nYou rushed to the Pokemon Center...");
            playerPokemon.fullHeal(); // Heal at Pokemon Center
        } else if (wildPokemon.isFainted()) {
            int expGain = wildPokemon.level * 10 + 20;
            boolean leveled = playerPokemon.gainExp(expGain);
            String msg = wildPokemon.name + " fainted!\n" + playerPokemon.name + " gained " + expGain + " EXP!";
            if (leveled) msg += "\n" + playerPokemon.name + " grew to level " + playerPokemon.level + "!";
            screen.showBattleMessage(playerPokemon, wildPokemon, msg);
        }
    }

    private Move chooseWildMove(Pokemon wild) {
        ArrayList<Move> available = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Move m = wild.getMove(i);
            if (m != null && m.hasPP()) {
                available.add(m);
            }
        }
        if (available.isEmpty()) return null;
        return available.get((int)(Math.random() * available.size()));
    }

    private void executeTurn(Pokemon playerPkm, Move pm, Pokemon wild, Move em) {
        int ps = (playerPkm.status == MoveCondition.PARALYSIS) ? playerPkm.getEffectiveSpd() / 2 : playerPkm.getEffectiveSpd();
        int es = (wild.status == MoveCondition.PARALYSIS) ? wild.getEffectiveSpd() / 2 : wild.getEffectiveSpd();

        Pokemon first, second;
        Move fm, sm;

        if (ps > es || (ps == es && pm.getPriority() > em.getPriority()) ||
                (ps == es && pm.getPriority() == em.getPriority() && Math.random() < 0.5)) {
            first = playerPkm; fm = pm; second = wild; sm = em;
        } else {
            first = wild; fm = em; second = playerPkm; sm = pm;
        }

        screen.showBattleMessage(playerPkm, wild, first.name + " used " + fm.getName() + "!");
        executeMove(first, fm, second, playerPkm, wild);
        if (second.isFainted()) {
            screen.showBattleMessage(playerPkm, wild, second.name + " fainted!");
            return;
        }

        if (!second.flinched) {
            screen.showBattleMessage(playerPkm, wild, second.name + " used " + sm.getName() + "!");
            executeMove(second, sm, first, playerPkm, wild);
        } else {
            screen.showBattleMessage(playerPkm, wild, second.name + " flinched!");
            second.flinched = false;
        }

        if (first.isFainted()) {
            screen.showBattleMessage(playerPkm, wild, first.name + " fainted!");
        }

        endTurn(playerPkm, wild);
    }

    private void executeEnemyMove(Pokemon wild, Move em, Pokemon playerPkm) {
        screen.showBattleMessage(playerPkm, wild, wild.name + " used " + em.getName() + "!");
        executeMove(wild, em, playerPkm, playerPkm, wild);
        if (playerPkm.isFainted()) {
            screen.showBattleMessage(playerPkm, wild, playerPkm.name + " fainted!");
        }
        endTurn(playerPkm, wild);
    }

    private void executeMove(Pokemon atk, Move move, Pokemon def, Pokemon playerPkm, Pokemon wild) {
        move.usePP();

        if (move.getPower() == 0) {
            applyStatus(atk, move, def, playerPkm, wild);
            return;
        }

        if (!move.hits()) {
            screen.showBattleMessage(playerPkm, wild, "But it missed!");
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
        screen.showBattleMessage(playerPkm, wild, msg);

        if (move.appliesCondition()) applyStatus(atk, move, def, playerPkm, wild);

        if (move.getCondition() == MoveCondition.RECOIL) {
            int rec = (int) (dmg * move.getConditionMagnitude() / 100.0);
            atk.takeDamage(rec);
            screen.showBattleMessage(playerPkm, wild, atk.name + " took " + rec + " recoil damage!");
        }
    }

    private void applyStatus(Pokemon atk, Move move, Pokemon def, Pokemon playerPkm, Pokemon wild) {
        switch (move.getCondition()) {
            case STAT_ATTACK_UP:
                atk.modifyAtk(move.getConditionMagnitude());
                screen.showBattleMessage(playerPkm, wild, atk.name + "'s Attack rose!");
                break;
            case STAT_ATTACK_DOWN:
                def.modifyAtk(-move.getConditionMagnitude());
                screen.showBattleMessage(playerPkm, wild, def.name + "'s Attack fell!");
                break;
            case STAT_DEFENSE_UP:
                atk.modifyDef(move.getConditionMagnitude());
                screen.showBattleMessage(playerPkm, wild, atk.name + "'s Defense rose!");
                break;
            case STAT_DEFENSE_DOWN:
                def.modifyDef(-move.getConditionMagnitude());
                screen.showBattleMessage(playerPkm, wild, def.name + "'s Defense fell!");
                break;
            case STAT_SPEED_UP:
                atk.modifySpd(move.getConditionMagnitude());
                screen.showBattleMessage(playerPkm, wild, atk.name + "'s Speed rose!");
                break;
            case STAT_SPEED_DOWN:
                def.modifySpd(-move.getConditionMagnitude());
                screen.showBattleMessage(playerPkm, wild, def.name + "'s Speed fell!");
                break;
            case STAT_ACCURACY_DOWN:
                def.modifyAccuracy(-move.getConditionMagnitude());
                screen.showBattleMessage(playerPkm, wild, def.name + "'s Accuracy fell!");
                break;
            case STAT_EVASION_DOWN:
                def.modifyEvasion(-move.getConditionMagnitude());
                screen.showBattleMessage(playerPkm, wild, def.name + "'s Evasion fell!");
                break;
            case BURN:
                if (def.status == MoveCondition.NONE) {
                    def.status = MoveCondition.BURN;
                    screen.showBattleMessage(playerPkm, wild, def.name + " was burned!");
                }
                break;
            case PARALYSIS:
                if (def.status == MoveCondition.NONE) {
                    def.status = MoveCondition.PARALYSIS;
                    screen.showBattleMessage(playerPkm, wild, def.name + " is paralyzed!");
                }
                break;
            case POISON:
                if (def.status == MoveCondition.NONE) {
                    def.status = MoveCondition.POISON;
                    screen.showBattleMessage(playerPkm, wild, def.name + " was poisoned!");
                }
                break;
            case FREEZE:
                if (def.status == MoveCondition.NONE) {
                    def.status = MoveCondition.FREEZE;
                    screen.showBattleMessage(playerPkm, wild, def.name + " was frozen solid!");
                }
                break;
            case SLEEP:
                if (def.status == MoveCondition.NONE) {
                    def.status = MoveCondition.SLEEP;
                    def.sleepTurns = 2 + (int) (Math.random() * 2);
                    screen.showBattleMessage(playerPkm, wild, def.name + " fell asleep!");
                }
                break;
            case CONFUSION:
                if (def.confusionTurns == 0) {
                    def.confusionTurns = 2 + (int) (Math.random() * 3);
                    screen.showBattleMessage(playerPkm, wild, def.name + " became confused!");
                }
                break;
            case FLINCH:
                def.flinched = true;
                break;
            case HEAL:
                int h = (int) (atk.calcMaxHp() * move.getConditionMagnitude() / 100.0);
                atk.heal(h);
                screen.showBattleMessage(playerPkm, wild, atk.name + " recovered " + h + " HP!");
                break;
            default:
                break;
        }
    }

    private void endTurn(Pokemon playerPkm, Pokemon wild) {
        if (playerPkm.isFainted() || wild.isFainted()) return;

        if (playerPkm.status == MoveCondition.BURN) {
            int d = playerPkm.calcMaxHp() / 8;
            playerPkm.takeDamage(d);
            screen.showBattleMessage(playerPkm, wild, playerPkm.name + " was hurt by burn! (-" + d + ")");
        }
        if (playerPkm.status == MoveCondition.POISON) {
            int d = playerPkm.calcMaxHp() / 8;
            playerPkm.takeDamage(d);
            screen.showBattleMessage(playerPkm, wild, playerPkm.name + " was hurt by poison! (-" + d + ")");
        }
        if (playerPkm.status == MoveCondition.SLEEP) {
            playerPkm.sleepTurns--;
            if (playerPkm.sleepTurns <= 0) {
                playerPkm.status = MoveCondition.NONE;
                screen.showBattleMessage(playerPkm, wild, playerPkm.name + " woke up!");
            } else {
                screen.showBattleMessage(playerPkm, wild, playerPkm.name + " is fast asleep...");
            }
        }
        if (playerPkm.confusionTurns > 0) {
            playerPkm.confusionTurns--;
            if (playerPkm.confusionTurns <= 0) {
                screen.showBattleMessage(playerPkm, wild, playerPkm.name + " snapped out of confusion!");
            }
        }

        if (wild.status == MoveCondition.BURN) {
            int d = wild.calcMaxHp() / 8;
            wild.takeDamage(d);
            screen.showBattleMessage(playerPkm, wild, wild.name + " was hurt by burn! (-" + d + ")");
        }
        if (wild.status == MoveCondition.POISON) {
            int d = wild.calcMaxHp() / 8;
            wild.takeDamage(d);
            screen.showBattleMessage(playerPkm, wild, wild.name + " was hurt by poison! (-" + d + ")");
        }
        if (wild.status == MoveCondition.SLEEP) {
            wild.sleepTurns--;
            if (wild.sleepTurns <= 0) {
                wild.status = MoveCondition.NONE;
                screen.showBattleMessage(playerPkm, wild, wild.name + " woke up!");
            } else {
                screen.showBattleMessage(playerPkm, wild, wild.name + " is fast asleep...");
            }
        }
        if (wild.confusionTurns > 0) {
            wild.confusionTurns--;
            if (wild.confusionTurns <= 0) {
                screen.showBattleMessage(playerPkm, wild, wild.name + " snapped out of confusion!");
            }
        }
    }

    private boolean attemptCatch(Pokemon wild, Pokemon playerPkm) {
        // Capture formula simplified from Gen 3
        int maxHP = wild.calcMaxHp();
        int currentHP = wild.currentHp;
        int catchRate = wild.catchRate;

        if (catchRate <= 0) catchRate = 255;

        double a = (3.0 * maxHP - 2.0 * currentHP) * catchRate / (3.0 * maxHP);

        int shakes = 0;
        String[] shakeMsgs = {
                "Oh no! The POKEMON broke free!",
                "Aww! It appeared to be caught!",
                "Aargh! Almost had it!",
                "Shoot! It was so close, too!"
        };

        if (a >= 255) {
            shakes = 4; // Guaranteed catch
        } else {
            double b = 65535.0 / Math.pow(255.0 / a, 0.25);
            for (int i = 0; i < 4; i++) {
                if (Math.random() * 65536 < b) {
                    shakes++;
                } else {
                    break;
                }
            }
        }

        // Shake animation
        for (int i = 0; i < shakes; i++) {
            screen.showBattleMessage(playerPkm, wild, "Wiggle... (" + (i+1) + ")");
        }

        if (shakes == 4) {
            screen.showBattleMessage(playerPkm, wild,
                    "All right!\n" + wild.name + " was caught!");
            player.addPokemon(wild);
            screen.showBattleMessage(playerPkm, wild,
                    wild.name + " has been added to your party!");
            return true;
        } else {
            screen.showBattleMessage(playerPkm, wild, shakeMsgs[shakes]);
            return false;
        }
    }
}
