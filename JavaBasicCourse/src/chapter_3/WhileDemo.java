/**
 * Demonstration of the use of the while loop
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

public class WhileDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        char ch;
        //вывод букв английского алфавит а, исполь зуя цикл while
        ch = 'A';
        while (ch <= 'Z'){
            System.out.println(ch);
            ch++;
        }
    }
}
