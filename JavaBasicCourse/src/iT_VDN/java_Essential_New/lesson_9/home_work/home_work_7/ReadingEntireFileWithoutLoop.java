/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-06
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingEntireFileWithoutLoop {
    private final String basePath;

    public ReadingEntireFileWithoutLoop(String basePath) {
        this.basePath = basePath;
    }

    public void readingEntireFileWithoutLoopMethod() {
        File file = new File(basePath);

        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\\Z");
            System.out.println(scanner.next());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
