/**
 * demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.08.2023
 */

package head_First_Java;

public class Hobbits {
    String name;

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = -1;

        while (z < 2) {
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "Більбо";
            if (z == 1) {
                h[z].name = "Фродо";
            }
            if (z == 2) {
                h[z].name = "Сем";
            }
            System.out.print(h[z].name + " - ");
            System.out.println("імя хорошого хоббіта");
        }
    }
}
