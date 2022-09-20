/**
 * Using nested loops to find
 * divisors of numbers from 2 to 100
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

public class FindFac {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            System.out.println("Дeлитeли " + i + ": ");
            for (int j = 2; j < i; j++)
                if((i%j) == 0)
                    System.out.println(j + " ");
                System.out.println();
        }
    }
}
