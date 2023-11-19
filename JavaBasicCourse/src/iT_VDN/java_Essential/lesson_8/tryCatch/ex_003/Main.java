/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2023-10-18
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_8.tryCatch.ex_003;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        try {
            throw new Exception("My exception");
        } catch (Exception e) {
            System.out.println("Обработка исключения.");
            System.out.println(e.getMessage());
        }
    }
}
