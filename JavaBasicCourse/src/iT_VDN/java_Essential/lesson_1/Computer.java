/**
 * java basic
 * lesson 1
 *
 * @author Valentyn Mozul
 * @version 1.0 from 29.08.2023
 */

package iT_VDN.java_Essential.lesson_1;

import java.util.Arrays;

public class Computer {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int[] computers = new int[5];
         for (int i = 0; i < computers.length; i++){
            computers[i] += i;
        }
        System.out.println(Arrays.toString(computers));
    }
}
