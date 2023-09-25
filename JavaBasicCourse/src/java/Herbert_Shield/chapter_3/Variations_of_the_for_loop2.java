/**
 * variations of the for loop2
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_3;

public class Variations_of_the_for_loop2 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        for(int i = 1; i <=14; i++){
            System.out.print(7 * i + " ");
        }
        int x = 1;
        System.out.println();
        for(int i = 1; i <=10; i++){
            System.out.print(x + " ");
            x *= 2; //x = x * 2;
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.print("* " + "* " + "* " + "* " + "* " + "\n");
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        int y = 1;
        int w = 1;
        System.out.print("Числа Фибоначчи - " + y + " " + w + " ");
        for(int q = 1; q < 20; q++){
            int su = y + w;
            System.out.print(su + " ");
            y = w;
            w = su;
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
            int s = (int)(Math.random() * 11);
            if(s == 5){
                System.out.println("Вот счастливый пельмень!");
                break;
            }
        }
    }
}
