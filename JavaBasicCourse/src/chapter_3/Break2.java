/**
 * Read the input data until you get the letter K
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

import java.io.IOException;

public class Break2 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
        char ch;
        for(; ;){
            ch = (char) System.in.read();
            if (ch == 'K') break;
        }
        System.out.println("Bы нажали клавишу K!");
    }
}
