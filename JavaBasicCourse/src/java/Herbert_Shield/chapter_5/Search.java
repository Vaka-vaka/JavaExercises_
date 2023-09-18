/**
 * Search in the database using the extended for loop
 *
 * @author Valentyn Mozul
 * @version 1.0 from 24.10.2022
 */

package java.Herbert_Shield.chapter_5;

public class Search {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int[] nums = {6, 8, 7, 3, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        // Использование цикла типа for-each для поиска
        // значения переменной val в массиве nums
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Знaчeниe найдено !");
    }
}
