/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2023-10-18
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_8.tryCatch.ex_009;

class ClassWithException {
    public void throwInner() throws Exception {
        throw new Exception("Это внутреннее исключение!");
    }

    public void catchInner() throws Exception {
        try {
            this.throwInner();
        } catch (Exception e) {
            throw new Exception("Это внешнее исключение!", e);
        }
    }
}

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ClassWithException instance = new ClassWithException();

        try {
            instance.catchInner();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Cause Exception: " + e.getCause());
        }
    }
}
