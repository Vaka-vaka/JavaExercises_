/**
 *
 *
 * @author Valentyn Mozul
 * @version 1.0 from 16.08.2023
 */

package head_First_Java;

public class Exersice1b {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
//       // int x = 1;
//        while (x < 10) {
//            if (x > 3) {
//                // System.out.println("Big X");
//            }
//            x = x + 1;
//        }


        int x = 0;
        int y = 0;
        while (x < 5){
                y = y + 2;
                if (y > 4){
                    y = y - 1;
                }
            System.out.print(x + " " + y + " ");
            x = x + 1;
        }
    }
}
