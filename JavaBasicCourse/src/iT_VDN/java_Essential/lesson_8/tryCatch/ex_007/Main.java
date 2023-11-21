/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2023-10-18
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_8.tryCatch.ex_007;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            System.out.println("Попытка деления на ноль.");
            System.out.println("a / (2 - n) = " + (a / (2 - n)));
        } catch (Exception e) {
            System.out.println("Обработка исключения.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Блок finally.");
        }
        System.out.println("Конец кода.");
    }
}
