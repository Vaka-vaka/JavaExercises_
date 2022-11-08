/**
 * Converting lowercase letters of the English alphabet to uppercase letters
 *
 * @author Valentyn Mozul
 * @version 1.0 from 02.11.2022
 */

package chapter_5;

public class UpCase {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        char ch, ch1;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            ch = (char) ((int) ch & 65503);
            System.out.print(ch + " ");
        }

        System.out.print("|| ");

        for (int y = 32; y < 42; y++) {
            ch = (char) ('A' + y);
            System.out.print(ch);

            ch1 = (char) ('!' + y);
            System.out.print(ch1 + " ");
        }
    }
}
