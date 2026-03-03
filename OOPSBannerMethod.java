/**
 * OOPS Banner App - Use Case 6
 * Goal: Refactor pattern logic into Static Helper Methods (DRY Principle).
 * @author Girish Ram Chandra
 * @version 1.0
 */
public class OOPSBannerMethod {

    public static void main(String[] args) {
        // Array Initialization via Method Invocation
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            // Assembling the line by composing patterns from helper methods
            bannerLines[i] = String.join("  ", 
                getOPattern(i), 
                getOPattern(i), 
                getPPattern(i), 
                getSPattern(i)
            );
        }

        // Loop-Based Rendering
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // Static Helper Methods with Perfect 7-Character Alignment
    
    public static String getOPattern(int line) {
        String[] patterns = {
            " ***** ", // 7 chars
            "*     *", // 7 chars
            "*     *", // 7 chars
            "*     *", // 7 chars
            "*     *", // 7 chars
            "*     *", // 7 chars
            " ***** "  // 7 chars
        };
        return patterns[line];
    }

    public static String getPPattern(int line) {
        String[] patterns = {
            "****** ", 
            "*     *", 
            "*      *", 
            "****** ", 
            "* ", 
            "* ", 
            "* "  
        };
        return patterns[line];
    }

    public static String getSPattern(int line) {
        String[] patterns = {
            "  ***** ", 
            " *      ", 
            "*      ", 
            " ***** ", 
            "           *", 
            "           *", 
            "      ***** "  
        };
        return patterns[line];
    }
}