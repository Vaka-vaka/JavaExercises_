/**
 * The letter guessing game
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_3;

import java.io.IOException;

public class Guess2 {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
        char ch, answer = 'K';
        System.out.println("Зaдyмaнa буква из диапазона A- Z.");
        System.out.println("Пoпытaйтecь ее угадать : ");

            while (true) {
            ch = (char) System.in.read();
            if (ch == answer) {
                System.out.println("** Правильно ! **");
                break;
            }
        }
    }
}