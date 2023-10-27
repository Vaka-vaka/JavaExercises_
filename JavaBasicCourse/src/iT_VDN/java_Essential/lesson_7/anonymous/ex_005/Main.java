/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-10-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_7.anonymous.ex_005;

interface Interface_5 {
    void method();

    int getValue();
}

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        // Объявление анонимного (внутреннего) класса
        Interface_5 interface_5 = new Interface_5() {
            int field = 0;

            @Override
            public void method() {
                field = 100;
            }

            @Override
            public int getValue() {
                return field;
            }
        };

        // Объявление анонимного (внутреннего) класса
        Interface_5 interface_51 = new Interface_5() {
            int field = -1;

            @Override
            public void method() {
                field = interface_5.getValue();
            }

            @Override
            public int getValue() {
                return field;
            }
        };

        interface_51.method();
        interface_5.method();

        System.out.println("interface_5: field = " + interface_5.getValue() + "    interface_51: field = " + interface_51.getValue());
    }
}
