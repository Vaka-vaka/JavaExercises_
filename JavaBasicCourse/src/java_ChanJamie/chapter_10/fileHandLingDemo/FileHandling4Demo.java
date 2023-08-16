/**
 * demo file hand ling demo
 * RENAMING AND DELETION  FILES
 *
 * @author Valentyn Mozul
 * @version 1.0 from 29.07.2023
 */

package java_ChanJamie.chapter_10.fileHandLingDemo;

import java.io.File;
import java.io.IOException;

public class FileHandling4Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
        File writes = new File("myFille2.txt");
        File writeM = new File("MyFille2.txt");

        writeM.renameTo(writes);
        writes.delete();

        System.out.println(writeM);
        System.out.println(writes);
    }
}
