/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.writeToFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFileString {

    private final String basePath;

    public WriteFileString(String basePath) {
        this.basePath = basePath;
    }

    public void writeFile(String content) {
        try {
            // Defining the file name of thr file
            Path fileName = Path.of(basePath);

            // Writing into the file
            Files.writeString(fileName, content);

            //Reading the content of file
            String file_content = Files.readString(fileName);

            //Printing the content inside the file
            System.out.println(file_content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
