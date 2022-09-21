/**
 * A program that reads characters from the keyboard
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

import java.io.IOException;

public class Keyboard {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = '.';
        char prob = ' ';
        int count = 0;

        do {
            System.out.println("Зaдyмaн символ");
            System.out.println("Пoпытaйтecь его угадать : ");
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == prob){
                count++;
            }

            if (ch == answer) {
                System.out.println("** Правильно! **");
                System.out.println("Пробелов - " + count);
            } else {
                System.out.println("Повтори :)");
            }
        } while (answer != ch);
    }
}
