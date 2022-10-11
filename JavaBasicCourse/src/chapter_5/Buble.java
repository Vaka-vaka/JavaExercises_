/**
 * Demonstration of the bubble algorithm
 *
 * @author Valentyn Mozul
 * @version 1.0 from 03.10.2022
 */

package chapter_5;

public class Buble {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        /*int[] nums = {-111, -12, 12, 343, 55555, 1, 5656, 56, 6666, -2323232};
        int a, b, c, size;
        size = 10; //количество сортируемых элементов
        // Отображение исходного массива
        System.out.print("Иcxoдный массив:");
        for(int i = 0; i < size; i++){
            System.out.print(" " + nums[i]);
        }
        System.out.println();
        // Реализация алгоритма пузырьковой сортировки
        //b = size-1 the з другого кінця 10 - 1
        for(a = 1; a < size; a++){
            for (b = size - 1; b >= a; b--){
                if (nums[b - 1] >= nums[b] ){
                    c = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = c;
                }
            }
        }
        // Отображение отсортированного массива
        System.out.print("Oтcopтиpoвaнный массив:");
        for (int i = 0; i < size; i++){
            System.out.print(" " + nums[i]);
        }
        System.out.println();

        System.out.print("Oтcopтиpoвaнный массив с конца):");
        for (int i = size - 1; i >= 0; i--){
            System.out.print(" " + nums[i]);
        }
        System.out.println();

        System.out.print("Oтcopтиpoвaнный массив первые 5:");
        for (int i = size - 1; i >= (nums.length/2); i--){
            System.out.print(" " + nums[i]);
        }
        System.out.println();

        System.out.print("Oтcopтиpoвaнный массив последние 5 с конца:");
        for (int i = 0; i < (nums.length/2); i++){
            System.out.print(" " + nums[i]);
        }
        System.out.println();*/
        String originalStr = "Hello";
        String reversedStr = "";
        for (int i = 0; i < originalStr.length();i++){
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        System.out.println("String: " + originalStr);
        System.out.println("String: " + reversedStr);
    }
}
