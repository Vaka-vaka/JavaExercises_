/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2024-04-04
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.lesson9;

import java.io.File;
import java.io.IOException;

public class FileManager {

    private String basePath;

    public FileManager(String basePath) {
        this.basePath = basePath;
    }

    public void createDirectory(String directoryName) {
        File directory = new File(basePath + directoryName);
        if (directory.exists()) {
            System.out.println("Директорія " + directoryName + " вже існує!");
        } else {
            if (directory.mkdir()) {
                System.out.println("Директорія " + directoryName + " створена успішно!");
            } else {
                System.out.println("Помилка при створені директорії " + directoryName);
            }
        }
    }

    public void createFile(String directoryName, String fileName) {
        File file = new File(basePath + directoryName, fileName);
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
}
