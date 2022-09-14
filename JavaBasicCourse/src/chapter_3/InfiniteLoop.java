/**
 * Skipping individual components in the definition of the for loop
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

import java.io.IOException;

public class InfiniteLoop {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
        int i = 0;
        System.out.println("Для остановки нажмите клавишу S");
        for (;(char) System.in.read() != 'S';) {
            System.out.println(i);
            i++;
        }
    }
}
