/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2024-04-04
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.lesson9;

import java.io.File;

public class FileManager {
    public void createDirectory(String directoryName) {
        File directory = new File("src\\iT_VDN\\java_Essential_New\\lesson_9\\lesson9");
        if (directory.exists()) {
            System.out.println("Директорія " + directoryName + " вже існує!");
        } else {
            if (directory.mkdir()) {
                System.out.println("Директорія " + directoryName + " створена успішно!");
            } else {
                System.out.println("Помилка при створені директорії" + directoryName);
            }
        }
    }
}
