/**
 * Using the for loop, display the matrix
 * З допомогою циклу for вивести на екран матрицю
 *
 * @author Valentyn Mozul
 * @version 1.0 from 03.04.2023
 */

package javaCours;

public class MatrixP {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            if (i == 1 || i == 7 || i == 9
                    || i == 13 || i == 17 || i == 19
                    || i == 21 || i == 25) {
                System.out.print(" * ");
                continue;
            } else if (i == 5) {
                System.out.print(" * ");
            }
            if (i == 10 || i == 15 || i == 20) {
                System.out.print(i + "\n");
                continue;
            }
            if (i == 5) {
                System.out.print("\n");
            } else {
                System.out.printf("%2d ", i);
            }
        }
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("==================================================");

        for (int i = 1; i <= 25; i++) {
            switch (i) {
                case 1, 5, 7, 9, 13, 17, 19, 21, 25 -> System.out.print(" * ");
                default -> System.out.printf("%2d ", i);
            }
            if ((i % 5) == 0) {
                System.out.print("\n");
            }
        }
    }
}
