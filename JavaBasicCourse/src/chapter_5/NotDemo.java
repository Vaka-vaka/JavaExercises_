/**
 * Demonstration of a bitwise operation NOT
 *
 * @author Valentyn Mozul
 * @version 1.0 from 06.11.2022
 */

package chapter_5;

public class NotDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        byte b = -34;
        for (int i = 128; i > 0; i = i / 2) {
            if ((b & i) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();
        b = (byte) ~ b;
        for (int i = 128; i > 0; i = i / 2) {
            if ((b & i) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
        //1 1 0 1 1 1 1 0 - 222
//        1 1 0 1 1 1 0 1 - 221

//        0 0 1 0 0 0 1 0 - 34
//        0 0 1 0 0 0 0 1 - 33

// 10010110 - 150

// 01101001 - 105