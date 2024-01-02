/**
 * java basic
 * lesson 5
 *
 * @version 1.0 from 2023-12-14
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_5.home_work_2;

public class ArrayInitializer {
    public int[] numbers = new int[11];

    public void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            numbers[i] = numbers[i] + i;
        }

        for (int i = 1; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
