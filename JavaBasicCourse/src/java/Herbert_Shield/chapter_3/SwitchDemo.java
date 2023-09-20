/**
 * Demonstration of the use of the switch instructions
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_3;

public class SwitchDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int i;

        for(i = 0; i <= 11; i++){
               /* switch (i){
                    case 0:
                        System.out.println("i равно 0");
                        break;
                    case 1:
                        System.out.println("i равно 1");
                        break;
                    case 2:
                        System.out.println("i равно 2");
                        break;
                    case 3:
                        System.out.println("i равно 3");
                        break;
                    case 4:
                        System.out.println("i равно 4");
                        break;
                    case 5:
                        System.out.println("i равно 5");
                        break;
                    case 6:
                        System.out.println("i равно 6");
                        break;
                    case 7:
                        System.out.println("i равно 7");
                        break;
                    case 8:
                        System.out.println("i равно 8");
                        break;
                    case 9:
                        System.out.println("i равно 9");
                        break;
                    case 10:
                        System.out.println("i равно 10");
                        break;
                    default:
                        System.out.println("i больше 10");
                }*/
            switch (i) {
                case 0 -> System.out.println("i равно 0");
                case 1 -> System.out.println("i равно 1");
                case 2 -> System.out.println("i равно 2");
                case 3 -> System.out.println("i равно 3");
                case 4 -> System.out.println("i равно 4");
                case 5 -> System.out.println("i равно 5");
                case 6 -> System.out.println("i равно 6");
                case 7 -> System.out.println("i равно 7");
                case 8 -> System.out.println("i равно 8");
                case 9 -> System.out.println("i равно 9");
                case 10 -> System.out.println("i равно 10");
                default -> System.out.println("i больше 10");
            }
        }
    }
}
