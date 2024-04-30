/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-04-26
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_4;

import java.util.Scanner;

public class MainText {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть текст для підрахунку: ");
        String text = scanner.nextLine();
        int numberText = text.length();
        System.out.println("Кількість символів у тексті = " + numberText);
    }
}
