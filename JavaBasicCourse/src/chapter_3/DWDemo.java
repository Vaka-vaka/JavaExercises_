/**
 * Demonstration of the use of the do-while loop
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

import java.io.IOException;

public class DWDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
        char ch;

        do{
            System.out.println("Haжмитe нужную клавишу, а затем клавишу ENTER :");
            ch = (char) System.in.read(); //чтение символа с клавиатуры
        } while (ch != 'q');
    }
}
