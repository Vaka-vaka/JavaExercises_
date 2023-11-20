/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2023-10-18
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_8.tryCatch.ex_006;

import java.io.FileInputStream;

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
        } catch (UserException userException) {
            System.out.println("Обробка винятків");
            userException.method();

            try {
                FileInputStream fs = new FileInputStream("C:\\NonExistentFile.log");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
