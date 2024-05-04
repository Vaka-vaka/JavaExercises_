/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-02
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateFileNew {
    public void newFile() {
        String strPath = "", strName = "";

        //W:/IT/Intelli IDEA(save projects)/JavaExercises/JavaBasicCourse/src/iT_VDN/java_Essential_New/lesson_9/home_work/home_work_7/

        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("Enter the file name: ");

            strName = br.readLine();
            System.out.println("Enter the file path: ");

            strPath = br.readLine();

            File file = new File(strPath +
                    strName + " .txt");
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}