/**
 * Assignment of references to the masses
 *
 * @author Valentyn Mozul
 * @version 1.0 from 05.10.2022
 */

package java.Herbert_Shield.chapter_5;

public class AssignAref {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int i;

        int[] nums1 = new int[10];
        int[] nums2 = new int[10];

        for (i = 0; i < 10; i++)
            nums1[i] = i;
        for (i = 0; i < 10; i++)
            nums2[i] = -i;
        System.out.print("Maccив nums1 : ");
        for (i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.print("Maccив nums2 : ");
        for (i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        nums2 = nums1;   //теперь обе переменные с сылаются на массив nums1

        System.out.print("Maccив nums2 после присваивания : ");
        for (i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

        // Выполнение операций над массивом nums1 через переменную nums2
        nums2[5] = 99;
        System.out.print("Maccив nums1 после изменения через nums2 : ");
        for (i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
    }
}
