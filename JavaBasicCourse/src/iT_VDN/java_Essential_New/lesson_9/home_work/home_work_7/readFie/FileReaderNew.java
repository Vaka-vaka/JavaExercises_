/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-06
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.readFie;

import java.io.FileReader;

public class FileReaderNew {
    private final String basePath;

    public FileReaderNew(String basePath) {
        this.basePath = basePath;
    }

    public void fileReaderNewMethod() {
        try {
            FileReader fileReader = new FileReader(basePath);
            int i;

            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
