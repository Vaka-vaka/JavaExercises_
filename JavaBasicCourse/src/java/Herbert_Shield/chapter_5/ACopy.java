/**
 * An example of using the length variable to copy arrays
 *
 * @author Valentyn Mozul
 * @version 1.0 from 05.10.2022
 */

package java.Herbert_Shield.chapter_5;

public class ACopy {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int i;
        int[] nums = new int[10];
        int[] nums2 = new int[10];

        for (i = 0; i < nums.length; i++)
            nums[i] = i;

        // Копирование массива nums в массив nums2
        if(nums2.length >= nums.length)
            for (i = 0; i < nums2.length; i++)
                nums2[i] = nums[i];
        for (i = 0; i < nums2.length;i++)
            System.out.print(nums2[i] + " ");
    }
}
