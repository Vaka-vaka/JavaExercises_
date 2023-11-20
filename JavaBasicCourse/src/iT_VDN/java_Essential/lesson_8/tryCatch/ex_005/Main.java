/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2023-10-18
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_8.tryCatch.ex_005;

class UserException extends Exception {
    public void method() {
        System.out.println("My exception!");
    }
}

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException e) {
            System.out.println("Обработка исключения.");
            e.method();
        }
    }
}
