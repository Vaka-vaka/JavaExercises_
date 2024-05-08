/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.writeToFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterNew {
    private final String basePath;

    public BufferedWriterNew(String basePath) {
        this.basePath = basePath;
    }

    public void bufferedWriterMethod(String content) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(basePath));

            bufferedWriter.write(content);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
