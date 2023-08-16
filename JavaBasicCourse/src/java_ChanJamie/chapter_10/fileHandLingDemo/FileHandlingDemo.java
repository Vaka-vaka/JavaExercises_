/**
 * demo file hand ling demo
 * до java7
 *
 * @author Valentyn Mozul
 * @version 1.0 from 28.07.2023
 */

package java_ChanJamie.chapter_10.fileHandLingDemo;

import java.io.*;

public class FileHandlingDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        String line;
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("MyFile.txt"));

            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();

            } catch (IOException e) {
                e.getMessage();
            }
        }
    }
}
