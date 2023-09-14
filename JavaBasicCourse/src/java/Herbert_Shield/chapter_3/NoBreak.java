/**
 * Demonstration of the use of the switch instruction without break
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_3;

public class NoBreak {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 11; i++) {
            switch (i) {
                case 0:
                    System.out.println("i равно 0");
                case 1:
                    System.out.println("i равно 1");
                case 2:
                    System.out.println("i равно 2");
                case 3:
                    System.out.println("i равно 3");
                case 4:
                    System.out.println("i равно 4");
                case 5:
                    System.out.println("i равно 5");
            }
            System.out.println();
        }
    }
}
