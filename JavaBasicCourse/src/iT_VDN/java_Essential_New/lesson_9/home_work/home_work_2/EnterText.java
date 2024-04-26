/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-04-25
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_2;

import java.util.Scanner;

public class EnterText {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст!");
        String text = scanner.nextLine();
        System.out.println(text.toUpperCase());
    }
}
