/**
 * OOPS Banner App - Use Case 4
 * Goal: Use a String Array and Loop to eliminate repetitive print statements.
 * @author Girish Ram Chandra
 * @version 1.0
 */
public class OOPSBannerLoop {
    public static void main(String[] args) {
        // 1. Array Creation: Initialize an empty String array for 7 lines
        String[] bannerLines = new String[7];

        // 2. Array Population: Use String.join() for each segment
        // Maintaining 7-line format and 9-character width for alignment
        bannerLines[0] = String.join("", "  *** ", "  *** ", " **** ", " **** ");
        bannerLines[1] = String.join("", " * * ", " * * ", " * * ", "   *      ");
        bannerLines[2] = String.join("", " * * ", " * * ", " * * ", "   *       ");
        bannerLines[3] = String.join("", " * * ", " * * ", "    **** ", "   *****");
        bannerLines[4] = String.join("", " * * ", " * * ", "   * ", "          *");
        bannerLines[5] = String.join("", " * * ", " * * ", "   * ", "          *");
        bannerLines[6] = String.join("", "  *** ", "  *** ", " * ", "    **** ");

        // 3. Enhanced For Loop: Traverse and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}