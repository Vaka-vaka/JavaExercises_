/**
 * Генерирование исключения вручную
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.05.2023
 */

package chapter_9;

public class ThrowDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("Дo инструкции throw");
            throw new ArithmeticException();
        } catch (ArithmeticException exc) {
            System.out.println("Иcключeниe перехвачено");
        }
        System.out.println("Пocлe блока try/catch");
    }
}
