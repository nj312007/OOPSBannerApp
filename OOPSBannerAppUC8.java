import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Centralized Data Store for patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        // UC8: Initialize the Map with character-to-pattern associations
        patternMap.put('O', new String[]{
            " ***** ", "* *", "* *", "* *", "* *", "* *", " ***** "
        });
        patternMap.put('P', new String[]{
            " ***** ", "* *", "* *", " ***** ", "* ", "* ", "* "
        });
        patternMap.put('S', new String[]{
            " ***** ", "* ", "* ", " ***** ", "      *", "      *", " ***** "
        });
    }

    public static void main(String[] args) {
        String word = "OOPS";
        renderBanner(word);
    }

    /**
     * UC8: Generic render function that builds any word based on the Map
     */
    public static void renderBanner(String word) {
        // A banner always has 7 rows
        for (int i = 0; i < 7; i++) {
            StringBuilder rowBuilder = new StringBuilder();
            
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(Character.toUpperCase(c));
                if (pattern != null) {
                    rowBuilder.append(pattern[i]).append("   "); // Add spacing
                }
            }
            System.out.println(rowBuilder.toString());
        }
    }
}