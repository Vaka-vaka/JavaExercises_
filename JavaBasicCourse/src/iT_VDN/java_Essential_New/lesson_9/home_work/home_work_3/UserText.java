/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-04-25
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserText {
    private final String basePath;

    public UserText(String basePath) {
        this.basePath = basePath;
    }

    public void createFile(String fileName) {
        File file = new File(basePath, fileName);
        if (file.exists()) {
            System.out.println("Файл " + fileName + " вже існує!");
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("Файл " + fileName + " створено успішно!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeTextToFile(String fileName, String content) {
        try {
            File file = new File(basePath, fileName);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Дані успішно записані у файл " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
