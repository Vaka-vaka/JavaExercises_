/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-06
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.readFie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderNew {
    private final String basePath;

    public BufferedReaderNew(String basePath) {
        this.basePath = basePath;
    }

    public void bufferedReaderNewMethod() {
        File file = new File(basePath);

        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(file));
            String str;

            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
