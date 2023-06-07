/**
 * Использование ключевого слова throws
 *
 * @author Valentyn Mozul
 * @version 1.0 from 01.06.2023
 */

package chapter_9;

public class ThrowsDemo {
    public static char prompt(String str)
            throws java.io.IOException {
        System.out.println(str + ":");
        return (char) System.in.read();
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        char ch;

        try {
            ch = prompt("Введите букву ");
        } catch (java.io.IOException exc) {
            System.out.println("Пpoизoшлo исключение ввода- вывода ");

            ch = 'X';
        }
        System.out.println("Bы нажали клавишу " + ch);
    }
}
