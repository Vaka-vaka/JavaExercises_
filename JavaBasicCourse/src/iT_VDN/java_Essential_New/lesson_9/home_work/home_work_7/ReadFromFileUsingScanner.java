/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-06
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7;

import java.io.File;
import java.util.Scanner;

public class ReadFromFileUsingScanner {

    private final String basePath;

    public ReadFromFileUsingScanner(String basePath) {
        this.basePath = basePath;
    }

    public void readFromFileUsingScannerMethod() {
        File file = new File(basePath);

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
