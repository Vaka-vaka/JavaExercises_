/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2023-10-18
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_8.tryCatch.ex_0013;

class MyExceptionA extends Exception {
    public MyExceptionA(String message) {
        super(message);
    }
}

class MyExceptionB extends MyExceptionA {
    public MyExceptionB(String message) {
        super(message);
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
            //throw new Exception("Exception");
            throw new MyExceptionA("MyExceptionA");
            //throw new MyExceptionB("MyExceptionB");
        } catch (MyExceptionB e) {
            System.out.println(e.getMessage());
        } catch (MyExceptionA e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
