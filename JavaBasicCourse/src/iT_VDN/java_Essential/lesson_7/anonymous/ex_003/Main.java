/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-10-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_7.anonymous.ex_003;

interface Interface_3 {
    void method();
}

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Interface_3 interface_3 = new Interface_3() {
            public int publicher = 23;

            public int getPublicher() {
                return publicher;
            }

            @Override
            public void method() {
                publicher = 123456;
                System.out.println("interface_3: publicher = " + getPublicher());
            }
        };
        interface_3.method();
    }
}
