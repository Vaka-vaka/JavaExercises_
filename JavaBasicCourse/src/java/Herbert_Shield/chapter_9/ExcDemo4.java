/**
 * Applying multiple catch instructions
 * Применение нескольких инструкций catch
 *
 * @author Valentyn Mozul
 * @version 1.0 from 22.03.2023
 */

package java.Herbert_Shield.chapter_9;

public class ExcDemo4 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int[] number = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + " / " + denom[i] + " = " + number[i] / denom[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Пoпыткa деления на нуль!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Cooтвeтcтвyющий элемент не найден");
            }
        }
    }
}
