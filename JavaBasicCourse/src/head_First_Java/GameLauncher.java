/**
 * demo guess
 *
 * @author Valentyn Mozul
 * @version 1.0 from 22.08.2023
 */
package head_First_Java;

public class GameLauncher {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
