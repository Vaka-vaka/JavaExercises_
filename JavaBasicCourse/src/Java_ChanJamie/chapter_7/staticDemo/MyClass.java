/**
 * static class demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 13.07.2023
 */

package Java_ChanJamie.chapter_7.staticDemo;

public class MyClass {
    // Нестатические поля и методы
    private String message = "Hello World";

    public void setMessage(String m) {
        message = m;
    }

    public String getMessage() {
        return message;
    }

    public void displayMessage() {
        System.out.println("Message " + getMessage());
    }

    // Статические поля и методы
    private static String greetings = "Good morning";

    public static void setGreetings() {
    }

    public static String getGreetings() {
        return greetings;
    }

    public static void displayGreetings() {
        System.out.println("Greetings " + getGreetings());
    }
}
