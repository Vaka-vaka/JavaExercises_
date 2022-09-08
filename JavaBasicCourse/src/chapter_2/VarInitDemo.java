/**
 * Demonstration of variable lifetime
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_2;

public class VarInitDemo {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++){
            int y = -1; // переменная у инициализируется
                        // при каждом входе в блок
            System.out.println("y: " + y); // всегда выводится  значение -1
            y = 100;
            System.out.println("Измeнeннoe значение у: " + y);
        }
    }
}
