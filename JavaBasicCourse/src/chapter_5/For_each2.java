/**
 * Add up the first 5 elements of the array
 *
 * @author Valentyn Mozul
 * @version 1.0 from 20.10.2022
 */

package chapter_5;

public class For_each2 {

    int for_each2(int[] each2){
        int sum, sum2 = 0;

        for (int x : each2){
            System.out.println("Змінюємо " + x);
            x = x * 2;
        }
        System.out.println();

        for (int y : each2){
            System.out.println("y - " + y);
            sum2 += y;
            if (y == 5) break;
            System.out.println("sum2 - " + sum2);
        }
        return sum2;
    }
}

class For_each2Demo{
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        For_each2 forEach2 = new For_each2();
        int result = forEach2.for_each2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(result);
    }
}
