/**
 * The letter guessing game
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

import java.io.IOException;

public class GuessЗ {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
        char ch, answer = 'K';

        System.out.println("Зaдyмaнa буква из диапазона A- Z.");
        System.out.println("Пoпытaйтecь ее угадать : ");
        ch = (char) System.in.read();
        if (ch == answer) {
            System.out.println("** Правильно ! **");
        } else System.out.println("Извинитe, нужная буква находится");
        if(ch < answer) {
            System.out.println("ближe к концу алфавита");
        }else System.out.println("ближe к началу алфавита");
    }
}
