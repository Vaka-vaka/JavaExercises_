/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.writeToFile;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterNew {

    private final String basePath;

    public FileWriterNew(String basePath) {
        this.basePath = basePath;
    }

    public void fileWriterMethod(String content) {
        try {
            FileWriter fileWriter = new FileWriter(basePath);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
