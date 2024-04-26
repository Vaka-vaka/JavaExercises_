/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-04-25
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_3;

import java.util.Scanner;

public class Main_HW3 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        String basePath = "W:/IT/Intelli IDEA(save projects)/JavaExercises/JavaBasicCourse/" +
                "src/iT_VDN/java_Essential_New/lesson_9/home_work/home_work_3/";

        UserText userText = new UserText(basePath);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привіт! Для запису у файл твого імені назви його...");
        String name = scanner.nextLine();
        String fileName = "user.txt";
        userText.createFile(fileName);
        userText.writeTextToFile(fileName, name);
    }
}
