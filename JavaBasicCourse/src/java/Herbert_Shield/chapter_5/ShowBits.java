/**
 * Displaying bits in, constituting bytes
 *
 * @author Valentyn Mozul
 * @version 1.0 from 03.11.2022
 */

package java.Herbert_Shield.chapter_5;

public class ShowBits {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int t;
        byte val;

        val = 123;
        for (t = 128; t > 0; t= t /2){
            if((val & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
