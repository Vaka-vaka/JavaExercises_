/**
 * Использование специально создаваемого исключения
 *
 * @author Valentyn Mozul
 * @version 1.0 from 08.06.2023
 */

package java.Herbert_Shield.chapter_9;

// Создание исключения
public class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public String toString() {
        return "Результат операции " + n + " / " + d + " не является целым числом ";
    }
}

class CustomExceptDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        // В массиве numer содержатся нечетные числа
        int[] number = {4, 8, 15, 32, 64, 127, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < number.length; i++) {
            try {
                if ((number[i] % 2) != 0)
                    throw new NonIntResultException(number[i], denom[i]);

                System.out.println(number[i] + " / " +
                        denom[i] + " равно " +
                        number[i] / denom[i]);
            } catch (ArithmeticException ехс) {
                // Перехват исключения
                System.out.println(" Пoпыткa деления на нуль");
            } catch (ArrayIndexOutOfBoundsException exc) {
                //Перехват исключения
                System.out.println("Cooтвeтcтвyющий элемент не найден ");
            } catch (NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}
