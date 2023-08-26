/**
 * demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 24.08.2023
 */

package head_First_Java;

public class EchoTestDrive {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Echo e1 = new Echo();
        //Echo e2 = new Echo();
        Echo e2 = e1;
        int x = 0;
        int y = e2.count;
        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 1;
            if (x == 3) {
                e2.count = e2.count + 1;
            }
            if (x > 0) {
                e2.count = e2.count + e1.count;
            }
            x = x + 1;

        }
        System.out.println(e2.count);
    }
}
