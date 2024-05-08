/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.writeToFile;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamNew {
    private final String basePath;

    public OutputStreamNew(String basePath) {
        this.basePath = basePath;
    }

    public void outputStreamMethod(String content) {
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(basePath);
            byte[] strBytes = content.getBytes();
            outputStream.write(strBytes);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
