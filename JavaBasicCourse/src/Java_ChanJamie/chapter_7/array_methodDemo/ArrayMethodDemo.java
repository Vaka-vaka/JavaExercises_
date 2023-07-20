/**
 * method class demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 18.07.2023
 */

package Java_ChanJamie.chapter_7.array_methodDemo;

import java.util.Arrays;

public class ArrayMethodDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyClass amd = new MyClass();
        int[] myArray = {1, 2, 3, 4, 5};
        amd.printFirstElement(myArray);

        int[] myArray2 = amd.returnArray();
        System.out.println(Arrays.toString(myArray2));

        int number = 2;
        System.out.println("number before = " + number);
        amd.passPrimitive(number);
        System.out.println("number after = " + number);
        System.out.println();

        System.out.println("myArray[1] before = " + myArray[1]);
        amd.passReference(myArray);
        System.out.println("myArray[1] after = " + myArray[1]);
    }
}
