/**
 * demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 26.08.2023
 */

package head_First_Java;

public class TestArrays2 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    String name;

    public static void main(String[] args) {
        int y = 0;
        TestArrays2[] islands = new TestArrays2[4];

        while (y < 4) {
            islands[y] = new TestArrays2();
            if (y == 0) {
                System.out.print("острова = ");
                System.out.println(islands[y].name = "Фіджі");
            } else if (y == 1) {
                System.out.print("острова = ");
                System.out.println(islands[y].name = "Косумель");
            } else if (y == 2) {
                System.out.print("острова = ");
                System.out.println(islands[y].name = "Бермуди");
            } else {
                System.out.print("острова = ");
                System.out.println(islands[y].name = "Азорскі острова");
            }
            y = y + 1;
        }
    }
}
