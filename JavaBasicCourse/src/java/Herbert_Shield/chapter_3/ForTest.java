/**
 * Output the square roots of numbers from 1 to 99 along with rounding error
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_3;

import java.io.IOException;

public class ForTest {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
        int i;
        System.out.println("Для остановки нажмите клавишу S");

        for(i = 0; (char) System.in.read() != 'S'; i++){
            System.out.println("Пpoxoд # " + i);
        }
    }
}
