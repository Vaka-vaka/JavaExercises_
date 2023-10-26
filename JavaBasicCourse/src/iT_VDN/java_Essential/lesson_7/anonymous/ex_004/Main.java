/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-10-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_7.anonymous.ex_004;

interface Interface_4 {
    void method();
}

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int N = 100;

        Interface_4 interface_4 = new Interface_4() {
            int num = 12;

            @Override
            public void method() {
                num = N;
                System.out.println("interface_4: num = " + num);
            }
        };
        interface_4.method();
    }
}
