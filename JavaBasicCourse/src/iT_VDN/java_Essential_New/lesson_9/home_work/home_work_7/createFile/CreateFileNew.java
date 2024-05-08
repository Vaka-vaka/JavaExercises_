/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-02
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.createFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateFileNew {
    private final String basePath;

    public CreateFileNew(String basePath) {
        this.basePath = basePath;
    }

    String strDirectory = "";
    public void createDirectory() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the directory name:");
            strDirectory = bufferedReader.readLine();

            File file = new File(basePath + strDirectory);
            if (file.exists()) {
                System.out.println("Папка" + strDirectory + " вже існує!");
            } else {
                if (file.mkdir()) {
                    System.out.println("Папку " + strDirectory + " створено успішно!");
                } else {
                    System.out.println("Помилка при створені папки " + strDirectory);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void newFile() {
        String strPath = "", strName = "";

        //W:/IT/Intelli IDEA(save projects)/JavaExercises/
        // JavaBasicCourse/src/iT_VDN/java_Essential_New/
        // lesson_9/home_work/home_work_7/

        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("Enter the file name: ");

            strName = br.readLine();
            //System.out.println("Enter the file path: ");

            //strPath = br.readLine();

            File file = new File(basePath + strName + ".txt");
            if (file.exists()) {
                System.out.println("Файл " + strName + " вже існує!");
            } else {
                if (file.createNewFile()) {
                    System.out.println("Файл " + strName + " створено успішно!");
                } else {
                    System.out.println("Помилка при створені файлу " + strName);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}