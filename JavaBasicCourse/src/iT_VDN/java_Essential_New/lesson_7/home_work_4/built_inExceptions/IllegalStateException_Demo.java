/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.home_work_4.built_inExceptions;

public class IllegalStateException_Demo {
    public static void print(int a, int b) {
        System.out.println("Addition of Positive Integers :" + (a + b));
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = -3;
        if (n1 >= 0 && n2 >= 0) {
            print(n1, n2);
        } else {
            throw new IllegalStateException("Either one or two number are not Positive Integer");
        }
    }
}
