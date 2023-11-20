/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2023-10-18
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_8.tryCatch.ex_004;

class MyClass {
    public void myMethod() throws Exception {
        Exception exception = new Exception("My exception");
        throw exception;
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
            MyClass instance = new MyClass();
            instance.myMethod();
        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Stack trace:");
            e.printStackTrace();
        }
    }
}
