/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-06
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.createFile;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateFileNew2 {
    public void newFile() {
        String strFilePath = "", strFileName = "";

       //W:/IT/Intelli IDEA(save projects)/JavaExercises/JavaBasicCourse/src/iT_VDN/java_Essential_New/lesson_9/home_work/home_work_7/

        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("Enter the file name: ");
            strFileName = br.readLine();

            System.out.println("Enter the file path: ");
            strFilePath = br.readLine();

            FileOutputStream fileOutputStream = new FileOutputStream(
                    strFilePath + "" + strFileName + ".txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
