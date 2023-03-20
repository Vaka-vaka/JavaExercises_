/**
 * int max
 *
 * @author Valentyn Mozul
 * @version 1.0 from 21.12.2022
 */

/*
intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
*/

package codingBat.warmup_1;

public class IntMax {
    int max = 0;

    int intMax(int a, int b, int c) {
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;

        /**
         max = Math.max(a, b);
         if (c > max) {
         max = c;
         }
         return max;
         */
    }
}

class IntMaxDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        IntMax intMax = new IntMax();
        System.out.println(intMax.intMax(1, 2, 3));
        System.out.println(intMax.intMax(2, 1, 3));
        System.out.println(intMax.intMax(3, 2, 1));
        System.out.println(intMax.intMax(-3, -1, -2));
    }
}