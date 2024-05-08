/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.readFie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadTextAsString {
    public static String readFileAsStringMethod(String fileName) {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        String data = readFileAsStringMethod("W:/IT/Intelli IDEA(save projects)/JavaExercises/JavaBasicCourse/" +
                "src/iT_VDN/java_Essential_New/lesson_9/home_work/home_work_5/output.txt");
        System.out.println(data);
    }
}
