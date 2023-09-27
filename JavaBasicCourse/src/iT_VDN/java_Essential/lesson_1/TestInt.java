/**
 * java basic
 * lesson 1
 *
 * @author Valentyn Mozul
 * @version 1.0 from 30.08.2023
 */

package iT_VDN.java_Essential.lesson_1;

public class TestInt {
    public void testInt() {
        Integer i = null;
        if (i == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        TestInt test = new TestInt();
        test.testInt();
    }
}
