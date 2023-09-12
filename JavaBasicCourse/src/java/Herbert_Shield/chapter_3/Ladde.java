/**
 * Demonstration of using the multistep if-else-if method
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_3;

public class Ladde {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int x;

        for(x=0; x<6; x++){
            if (x==1){
                System.out.println("x равно 1");
            }
            else if (x==2){
                System.out.println("x равно 2");
            }
            else if (x==3){
                System.out.println("x равно 3");
            }
            else if (x==4) {
                System.out.println("x равно 4");
            }
            else System.out.println("Знaчeниe х находится вне диапазона 1 - 4");
        }
    }
}
