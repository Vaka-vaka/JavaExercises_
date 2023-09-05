/**
 * Application of the sopt i pce manual
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_3;

public class ContDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int i, j;

        // Вывод четных и нечетных чисел в пределах от О до 100
        System.out.print("odd-numbered: ");
        for (i = 0; i < 100; i++){
            if((i%2) == 0) continue; //(== odd-numbered)
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("сhetni: ");
        for (j = 0; j < 100; j++){
            if((j%2) != 0) continue; // (!= сhetni)
            System.out.print(j + " ");
        }
    }
}
