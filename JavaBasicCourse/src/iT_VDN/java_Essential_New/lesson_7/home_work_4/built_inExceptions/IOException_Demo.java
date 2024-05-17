/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.home_work_4.built_inExceptions;

import java.util.Scanner;

public class IOException_Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner("Hello world!");

        System.out.println("" + scan.nextLine());

        System.out.println("Exception Output: " + scan.ioException());

        scan.close();
    }
}
