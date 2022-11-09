/**
 * Demonstration of the use of operators << and >>
 *
 * @author Valentyn Mozul
 * @version 1.0 from 07.11.2022
 */

package chapter_5;

public class ShiftDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int val = 1;

        for (int i = 0; i < 8; i++) {
            for (int t = 128; t > 0; t = t / 2) {
                if ((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val = val << 1;  // сдвиг влево *2
        }
        System.out.println();

        val = 128;
        for (int i = 0; i < 8; i++) {
            for (int t = 128; t > 0; t = t / 2) {
                if ((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val = val >> 1;  //сдвиг вправо /2
        }
        System.out.println();

        int x = 1000;
        //умножить на 2
        x = x << 1;
        System.out.println("<< " + x);

        int y = 1000;
        //делить на 2
        y = y >> 1;
        System.out.println(">> " + y);
    }
}
