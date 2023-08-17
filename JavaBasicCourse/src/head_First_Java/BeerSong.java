/**
 * demo beer song
 *
 * @author Valentyn Mozul
 * @version 1.0 from 15.08.2023
 */

package head_First_Java;

public class BeerSong {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int beerNum = 99;
        String word = " пляшок (пляшки)";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = " пляшка";
            }

            System.out.println(beerNum + word + " пива на столі");
            System.out.println(beerNum + word + " пива!");
            System.out.println("Візьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;

            if (beerNum == 0) {
                System.out.println("От і все. Нічого не залишилося");
            }
        }
    }
}
