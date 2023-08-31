/**
 * Applying the break instruction in nested cycles
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_3;

public class Break3 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            System.out.println("Cчeтчик внешнего цикла : " + i);
            System.out.print("Счетчик внутреннего цикла : ");
            int t = 1;
            while (t < 100){
                if(t == 16) break; //прерывание цикла, если t 10
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
