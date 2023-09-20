/**
 * Demonstration of the use of a two-dimensional array
 *
 * @author Valentyn Mozul
 * @version 1.0 from 04.10.2022
 */

package java.Herbert_Shield.chapter_5;

public class TwoD {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int t, i;
        int[][] table = new int[3][4];
        for (t = 0; t < 3; ++t){
            for (i = 0; i < 4; ++i){
                table[t][i] = (t * 4) + i + 1;
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }
    }
}
