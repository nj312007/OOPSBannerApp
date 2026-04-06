public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC5: Inline Array Initialization with String.join()
        // We declare, initialize, and populate the array in one single statement
        String[] bannerLines = {
            String.join("  ", "*****", " * ", " * ", " * ", "*****"), // Row 1
            String.join("  ", "* ", " * ", " * ", " * ", "* *"),       // Row 2
            String.join("  ", "* ", " * ", " * ", " * ", "* "),         // Row 3
            String.join("  ", "*****", " * ", " * ", " * ", "*****"), // Row 4
            String.join("  ", "    *", " * ", " * ", " * ", "* "),     // Row 5
            String.join("  ", "    *", " * ", " * ", " * ", "* *"),     // Row 6
            String.join("  ", "*****", "*****", "*****", "*****", "*****")  // Row 7
        };

        // Efficiently rendering using an enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}