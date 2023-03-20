/**
 * The Dart 101
 *
 * @author Valentyn Mozul
 * @version 1.0 from 09.02.2023
 */

package codinGame;

import java.util.Scanner;

public class TheDart101 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String PLAYER = in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String SHOOTS = in.nextLine();
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println("winner");

    }
}
