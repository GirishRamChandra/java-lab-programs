/**
 * OOPS Banner App - Use Case 5
 * Goal: Use Inline Array Initialization for concise code.
 * @author Girish Ram Chandra
 * @version 1.0
 */
public class OOPSBannerInline {
    public static void main(String[] args) {
        // Inline Initialization: Declaration, creation, and population in ONE statement
        String[] bannerLines = {
            String.join(" ", "  ***** ", "  ***** ", " ****** ", "  ***** "),
            String.join(" ", " *     *", " *     *", " *     *", " *      "),
            String.join(" ", " *     *", " *     *", " ****** ", "  ***** "),
            String.join(" ", " *     *", " *     *", " * ", "           * "),
            String.join(" ", " *     *", " *     *", " * ", "           * "),
            String.join(" ", "  ***** ", "  ***** ", " * ", "      *****  ")
        };

        // Enhanced For Loop for clean traversal
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}