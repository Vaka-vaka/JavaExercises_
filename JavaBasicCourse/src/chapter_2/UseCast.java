/**
 * To use types to correctly calculate an expression
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_2;

public class UseCast {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; i++) {
            System.out.print(i + "/3: " + i / 3);
            System.out.println(" | " + i + "/3 с дробной частью : " + (double) i / 3);
        }

        // 5. Какая ошибка допущена в следующем фрагменте кода?

        for (i = 0; i < 10; i++) {
            int sum = 0;
            sum = sum + i;
            System.out.println("Сумма: " + sum);

        }
    }
}
