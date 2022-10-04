/**
 * Intentional exit from the array
 *
 * @author Valentyn Mozul
 * @version 1.0 from 02.10.2022
 */

package chapter_5;

public class ArrayErr {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int[] sample = new int[10];
        int i;

        //Имитация выхода индекса за пределы массива
        for(i = 0; i < 100; i++){
            sample[i] = i;
        }
    }
}
