/**
 * Converting uppercase letters of the English alphabet to lowercase letters
 *
 * @author Valentyn Mozul
 * @version 1.0 from 04.11.2022
 */

package chapter_5;

public class LowCase {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            ch = (char) ((int) ch | 32);
            System.out.print(ch + " ");
        }
    }
}
