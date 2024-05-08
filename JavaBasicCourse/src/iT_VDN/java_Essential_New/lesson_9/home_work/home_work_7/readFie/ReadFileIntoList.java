/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.readFie;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFileIntoList {
    public static List<String> readFileInListMethod(String fileName) {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        List l = readFileInListMethod("W:/IT/Intelli IDEA(save projects)/JavaExercises/JavaBasicCourse/" +
                "src/iT_VDN/java_Essential_New/lesson_9/home_work/home_work_5/input.txt");

        Iterator<String> itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
