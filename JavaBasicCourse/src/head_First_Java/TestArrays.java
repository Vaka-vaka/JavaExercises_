/**
 * demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 26.08.2023
 */

package head_First_Java;

public class TestArrays {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    String name;
    public static void main(String[] args) {
        int y = 0;
        TestArrays[] islands = new TestArrays[4];
        islands[0] = new TestArrays();
        islands[1] = new TestArrays();
        islands[2] = new TestArrays();
        islands[3] = new TestArrays();

        islands[2].name = "Бермуди";
        islands[0].name = "Фіджі";
        islands[3].name = "Азорскі острова";
        islands[1].name = "Косумель";

        while (y < 4) {
            System.out.print("острова = ");
            System.out.println(islands[y].name);
            y = y + 1;
        }
    }
}
