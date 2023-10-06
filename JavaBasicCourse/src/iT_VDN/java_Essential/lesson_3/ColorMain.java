/**
 * java basic
 * lesson 3
 *
 * @version 1.0 from 2023-09-10
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_3;

public class ColorMain {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        System.out.println(ANSI_YELLOW + "This text is yellow!");
    }
}
