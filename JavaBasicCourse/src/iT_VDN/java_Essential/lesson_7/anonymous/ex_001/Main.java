/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-10-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_7.anonymous.ex_001;

interface Interface_1 {
    void method();
}

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        // Объявление анонимного (внутреннего) класса
        Interface_1 interface_1 = new Interface_1() {
            @Override
            public void method() {
                System.out.println("Call method() from anonymous class");
            }
        };
        // Вызов метода объекта анонимного класса
        interface_1.method();
    }
}
