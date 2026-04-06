public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC6: Modular Array Initialization using Static Helper Methods
        // This makes the code reusable and easy to read.
        String[] bannerLines = {
            buildRow(0),
            buildRow(1),
            buildRow(2),
            buildRow(3),
            buildRow(4),
            buildRow(5),
            buildRow(6)
        };

        // Render the final banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Helper to build a single row of the banner by joining character parts.
     */
    private static String buildRow(int row) {
        return String.join("   ", getORow(row), getORow(row), getPRow(row), getSRow(row));
    }

    // --- Character Pattern Methods ---

    private static String getORow(int row) {
        String[] o = {
            " ***** ",
            "* *",
            "* *",
            "* *",
            "* *",
            "* *",
            " ***** "
        };
        return o[row];
    }

    private static String getPRow(int row) {
        String[] p = {
            " ***** ",
            "* *",
            "* *",
            " ***** ",
            "* ",
            "* ",
            "* "
        };
        return p[row];
    }

    private static String getSRow(int row) {
        String[] s = {
            " ***** ",
            "* ",
            "* ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
        return s[row];
    }
}