/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2023-10-18
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_8.tryCatch.ex_008;

class UserException extends Exception {
    public void method() {
        System.out.println("Мое Исключение!");
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
            System.out.println("Обработка исключения 1:");
            userException.method();

            try {
                throw userException;
            } catch (UserException exception) {
                System.out.println("Обработка исключения 2:");
                exception.method();
            }
        } finally {
            System.out.println("Блок finally.");
        }
        System.out.println("Конец кода.");
    }
}
