/**
 * In the catch instructions, the subclass exceptions must precede superclass exceptions
 * В инструкциях catch исключения подкласса должны предшествовать исключениям суперкласса
 *
 * @author Valentyn Mozul
 * @version 1.0 from 22.03.2023
 */

package chapter_9;

public class ExcDemo5 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int[] number = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 8, 0, 0};

        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + "/" + denom[i] + " = " + number[i] / denom[i]);
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Cooтвeтcтвyющий элемент не найден");
            } catch (Throwable e) {
                System.out.println("Возникло исключение");
            }
        }
    }
}
