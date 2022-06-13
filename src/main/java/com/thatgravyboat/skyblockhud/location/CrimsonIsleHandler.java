package com.thatgravyboat.skyblockhud.location;

public class CrimsonIsleHandler {

    public enum bosses {
        BLADESOUL("Bladesoul", 50000000),
        MAGMABOSS("Old Dragon", 200000000),
        MAGEOUTLAW("Wise Dragon", 70000000),
        BARBARIANDUKEX("Unstable Dragon", 70000000),
        ASHFANG("Young Dragon", 50000000),
        // KUUDRABASIC("Strong Dragon", 9000000),
        // KUUDRAHOT("Superior Dragon", 12000000),
        // KUUDRABURNING("Superior Dragon", 12000000),
        // KUUDRAFIERY("Superior Dragon", 12000000),
        // KUUDRAINFERNAL("Superior Dragon", 12000000),
        NOBOSS("", 0);

        private final String displayName;
        private final int maxHealth;

        bosses(String displayName, int maxHealth) {
            this.displayName = displayName;
            this.maxHealth = maxHealth;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public int getMaxHealth() {
            return this.maxHealth;
        }

        public static bosses findBoss(String input) {
            if (input.contains(" ")) {
                try {
                    return bosses.valueOf(input.toLowerCase().replace(" ", "").toUpperCase());
                } catch (IllegalArgumentException ignored) {
                    return NOBOSS;
                }
            } else {
                try {
                    return bosses.valueOf(input);
                } catch (IllegalArgumentException ignored) {
                    return NOBOSS;
                }
            }
        }
    }

    private static bosses currentBoss = bosses.NOBOSS;

    public static void setCurrentBoss(bosses boss) {
        currentBoss = boss;
    }
}
