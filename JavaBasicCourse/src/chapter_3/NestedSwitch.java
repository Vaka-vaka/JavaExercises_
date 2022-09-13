/**
 * Nested switch instructions
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

public class NestedSwitch {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 5; i++) {
            switch (i) {
                case 0, 1, 2, 3, 4, 5 -> System.out.println("example " + i);
            }
        }
        char ch1 = 0, ch2 = 0;
        switch (ch1) {
            case 'А':
                System.out.println("Этo ветвь внешней инструкции switch");
                switch (ch2) {
                    case 'А':
                        System.out.println("Этo ветвь внутренней инструкции switch");
                        break;
                    case 'В': // ...
                }    //конец внутренней инструкции switch
                        break;
                    case 'В':
                        break;
                }
        }
    }
