/**
 * Using the extended for loop
 * to process a two-dimensional array
 *
 * @author Valentyn Mozul
 * @version 1.0 from 20.10.2022
 */

package java.Herbert_Shield.chapter_5;

public class For_each3 {

    int for_each3(int[][] nums){
        int sum = 0;
        //int nums[][] = new int[0][];
        // Ввод ряда значений в массив nums
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);
                // Использование цикла типа for-each для
                // суммирования и отображения значений.
            for (int x[] : nums){
                for (int y : x){
                    System.out.println("Знaчeниe : " + y);
                    sum += y;
                }
            }
        return sum;
    }
}

class For_each3Demo{
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        For_each3 forEach3 = new For_each3();
        int sum = forEach3.for_each3(new int[3][5]);
        System.out.println(sum);
    }
}