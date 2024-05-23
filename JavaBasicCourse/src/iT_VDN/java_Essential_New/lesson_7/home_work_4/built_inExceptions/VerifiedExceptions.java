/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.home_work_4.built_inExceptions;

import java.io.BufferedReader;
import java.io.FileReader;

public class VerifiedExceptions {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader(
                    "W:\\IT\\Intelli IDEA(save projects)\\JavaExercises" +
                            "\\JavaBasicCourse\\src\\iT_VDN\\java_Essential_New" +
                            "\\lesson_7\\home_work_4\\built_inExceptions\\file.txt");

            BufferedReader fileInput = new BufferedReader(file);

            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.readLine());

            fileInput.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
