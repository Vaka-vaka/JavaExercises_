/**
 * java advanced
 * lesson 1
 *
 * @version 1.0 from 2023-11-20
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_1.ex_003_sorting.sorting_arrays;

import java.util.Arrays;

public class SortingStudents {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int[] marks = {7, 8, 9, 3, 0, 11};
        String[] students = {"Alex", "Andrew", "Yevhenii", "Karina"};

        Arrays.sort(marks);
        Arrays.sort(students);

        for (int tmp : marks) {
            System.out.println(tmp + " ");
        }
        System.out.println();

        for (String tmp : students) {
            System.out.println(tmp + " ");
        }
    }
}
