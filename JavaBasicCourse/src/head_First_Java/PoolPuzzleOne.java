/**
 * demo puzzle
 *
 * @author Valentyn Mozul
 * @version 1.0 from 21.08.2023
 */

package head_First_Java;

public class PoolPuzzleOne {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int x = 0;

        while (x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x < 1) {
                System.out.print("oise");
            }
            if (x == 1) {
                System.out.print("noys");
            }
            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }
            System.out.println("");
            x = x + 1;
        }
    }
}
