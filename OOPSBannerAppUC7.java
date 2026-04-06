public class OOPSBannerApp {

    // UC7: Encapsulating patterns into a Class structure for scalability
    public static void main(String[] args) {
        // Define our character mappings
        CharacterPatternMap charO = new CharacterPatternMap('O', new String[]{
            " ***** ", "* *", "* *", "* *", "* *", "* *", " ***** "
        });
        
        CharacterPatternMap charP = new CharacterPatternMap('P', new String[]{
            " ***** ", "* *", "* *", " ***** ", "* ", "* ", "* "
        });

        CharacterPatternMap charS = new CharacterPatternMap('S', new String[]{
            " ***** ", "* ", "* ", " ***** ", "      *", "      *", " ***** "
        });

        // Initialize array by retrieving pattern rows from objects
        String[] bannerLines = new String[7];
        for (int i = 0; i < 7; i++) {
            // Build the row for "OOPS" using the getters
            bannerLines[i] = String.join("   ", 
                charO.getRow(i), 
                charO.getRow(i), 
                charP.getRow(i), 
                charS.getRow(i)
            );
        }

        // Render the banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * UC7: Dedicated class to encapsulate character-to-pattern mappings.
     * This makes it easy to add new letters (A, B, C...) without changing main logic.
     */
    static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getRow(int rowIndex) {
            if (rowIndex >= 0 && rowIndex < pattern.length) {
                return pattern[rowIndex];
            }
            return "";
        }

        public char getCharacter() {
            return character;
        }
    }
}