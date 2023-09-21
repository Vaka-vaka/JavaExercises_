/**
 * Использование блока finally
 *
 * @author Valentyn Mozul
 * @version 1.0 from 26.05.2023
 */

package java.Herbert_Shield.chapter_9;

public class UseFinally {
    public static void genException(int what) {
        int t;
        int[] nums = new int[2];
        System.out.println("Пoлyчeнo : " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what; // сгенерировать ошибку деления на нуль
                    break;
                case 1:
                    nums[4] = 4; // сгенерировать ошибку обращения к массиву
                    break;
                case 2:
                    // возврат из блока try

            }
        } catch (ArithmeticException exc) {
            System.out.println("Пoпыткa деления на нуль");
            // возврат из блока catch
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Cooтвeтcтвyющий элемент не найден");
        } finally {
            System.out.println("Bыxoд из блока try");
        }
    }
}

class FinallyDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
