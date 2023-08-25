/**
 * demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 23.08.2023
 */

package head_First_Java;

public class TapeDeck {
    boolean canRecord = false;

    void PlayTape() {
        System.out.println("Плівка грає");
    }

    void recordTape() {
        System.out.println("Іде запис на плівку");
    }
}

class TapeDeckTestDrive {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {

        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.PlayTape();

        if (t.canRecord) {
            t.recordTape();
        }
    }
}
