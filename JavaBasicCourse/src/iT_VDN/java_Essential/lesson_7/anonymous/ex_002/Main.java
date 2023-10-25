/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-10-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_7.anonymous.ex_002;

interface Interface_2 {
    void method();
}

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Interface_2 interface_2 = new Interface_2() {
            public double d = 1.3;
            protected String str = "Anonymous classes";
            private int num = 10;

            @Override
            public void method() {
                num = 12345;
                System.out.println("interface_2: d = " + d + ", str = " + str + ", num = " + num);
            }
        };
        interface_2.method();
    }
}
