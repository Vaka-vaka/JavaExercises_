/**
 * Уничтожьте горы,
 * прежде чем ваш звездолет столкнется с одной из них.
 * Для этого стреляйте в самую высокую гору на своем пути.
 *
 * @author Valentyn Mozul
 * @version 1.0 from 09.02.2023
 */

package codinGame;

import java.util.Scanner;

public class Max {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        int Imax = 0;
        // game loop
        while (true) {
            max = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if (mountainH > max) {
                    max = mountainH;
                    Imax = i;
                }
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            System.out.println(Imax); // The index of the mountain to fire on.
        }
    }
}
