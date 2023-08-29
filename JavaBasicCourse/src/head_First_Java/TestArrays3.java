/**
 * demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 26.08.2023
 */

package head_First_Java;

public class TestArrays3 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int[] index = new int[4];
        index[0] = 0;
        index[1] = 1;
        index[2] = 2;
        index[3] = 3;

        String[] islands = new String[4];
        islands[2] = "Бермуди";
        islands[0] = "Фіджі";
        islands[3] = "Азорскі острова";
        islands[1] = "Косумель";
        int y = 0;
        int ref;
        while (y < 4) {
            ref = index[y];
            System.out.print("острова = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}
