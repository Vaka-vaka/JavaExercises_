/**
 * demo file hand ling demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 28.07.2023
 */

package Java_ChanJamie.chapter_10.fileHandLingDemo;

import java.io.*;

public class FileHandling2Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        String line;

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("MyFile2.txt"));

            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
