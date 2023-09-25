/**
 * variations of the for loop
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_3;

import java.util.Scanner;

public class Variations_of_the_for_loop {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
            for(int i = 1; i <= 5; i++){
                System.out.print(i + " ");
            }
        System.out.println();
            for(int i = 5; i >= 1; i--){
                System.out.print(i + " ");
            }
        System.out.println();
            int i, x, sum;
            x = 3;
            for (i = 0; i <=10; i++){
                sum = x * i;
                System.out.println(x + "*" + i + "=" + sum);
            }
        System.out.println("Введите любое целое положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sam = 0;
        int fac = 1;
        for (int a = 1; a <=n; a++){
            sam += a;
            fac *= a;
        }
        System.out.println("Cyммa: " + sam);
        System.out.println("Фaктopиaл : " + fac);


    }
}
