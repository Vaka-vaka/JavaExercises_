/**
 * Reading a character from the keyboard
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

import java.io.IOException;

public class KbIn {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
           char ch;
        System.out.println("Haжмитe нужную клавишу, а затем " +
                "клавишу ENTER : ");
        ch = (char) System.in.read();
        System.out.println("Bы нажали клавишу " + ch);
    }
}
