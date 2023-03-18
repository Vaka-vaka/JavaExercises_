/**
 * Correct exception handling and continuation of program execution
 * Корректная обработка исключения и продолжение выполнения програм
 *
 * @author Valentyn Mozul
 * @version 1.0 from 19.03.2023
 */

package chapter_9;

public class ExcDemo3 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int[] number = {4, 8, 16, 32, 64, 128, 240, 360};
        int[] denom = {2, 4, 4, 0, 8, 0, 0, 0};

        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + " / " + denom[i] + " = " + number[i] / denom[i]);
            } catch (ArithmeticException exc) {
                // Перехват исключения
                System.out.println("Пoпыткa деления на нуль!");
            }
        }
    }
}
