/**
 * OOPS Banner App - Use Case 3
 * Goal: Use String.join() for better memory management.
 * @author Girish Ram Chandra
 * @version 1.0
 */
public class OOPSBannerJoin {
    public static void main(String[] args) {
        // Using String.join to assemble the banner lines
        // String.join(delimiter, elements...)
         System.out.println(String.join(" ",  " ****", "    ****", "  ******", "    ******"));
        System.out.println(String.join(" ", "*     *", "*     *", "  *     *", "   *     "));
        System.out.println(String.join(" ", "*     *", "*     *", "  *     *", "   *     "));
        System.out.println(String.join(" ", "*     *", "*     *", "  ******", "    ******"));    
        System.out.println(String.join(" ", "*     *", "*     *", "  *       ","        *"));
        System.out.println(String.join(" ", "*     *", "*     *", "  *       ","        *"));
        System.out.println(String.join(" ", " ****", "   * ****", "  *       ","  ******"));
    }
}