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

        // Populating 7 lines with wider, 7-character segments
        bannerLines[0] = String.join("  ", " ***** ", " ***** ", " ******", " ***** ");
        bannerLines[1] = String.join("  ", "*     *", "*     *", "*     *", "*     ");
        bannerLines[2] = String.join("  ", "*     *", "*     *", "****** ", " ***** ");
        bannerLines[3] = String.join("  ", "*     *", "*     *", "*      ", "      *");
        bannerLines[4] = String.join("  ", "*     *", "*     *", "*      ", "      *");
        bannerLines[5] = String.join("  ", " ***** ", " ***** ", "*      ", " ****** ");
        bannerLines[6] = "                                         "; // Padding line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}