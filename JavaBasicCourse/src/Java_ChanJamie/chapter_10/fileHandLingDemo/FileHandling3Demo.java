/**
 * demo file hand ling demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 28.07.2023
 */

package Java_ChanJamie.chapter_10.fileHandLingDemo;

import codingBat.warmup_1.Front22;

import java.io.*;

public class FileHandling3Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {

        File writes = new File("myFille2.txt");
        String text = "Hello Natalya! How are you? Haaa, Haaaaa, Haagaaaa";

        String text2 = "Hello World!";
        BufferedWriter writer = new BufferedWriter(new FileWriter("myFille.txt"));

        try (BufferedWriter writer2 = new BufferedWriter(
                new FileWriter("MyFile2.txt"))) {

            writer2.write(text);
            writer2.newLine();
            writer2.write("Hello Cacacha!!!");

            writer.write(text2);
            writer.newLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
