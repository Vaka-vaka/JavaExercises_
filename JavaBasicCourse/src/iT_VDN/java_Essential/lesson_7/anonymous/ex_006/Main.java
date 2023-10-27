/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-10-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_7.anonymous.ex_006;

interface Interface_6 {
    void method();

    int getValue();
}

class ConcreteClass implements Interface_6 {
    protected int protectedField = 10;

    public void method() {
        System.out.println("ConcreteClass: method()");
    }

    public int getValue() {
        return protectedField;
    }
}

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        // Объявление анонимного (внутреннего) класса
        ConcreteClass instance1 = new ConcreteClass() {
            @Override
            public void method() {
                System.out.println("instance1: method()");
            }
        };

        // Объявление анонимного (внутреннего) класса
        Interface_6 instance2 = new ConcreteClass() {
            int protectedField = 3;

            @Override
            public void method() {
                System.out.println("instance2: method()");
            }

            @Override
            public int getValue() {
                return this.protectedField + super.getValue();
            }
        };

        instance1.method();
        instance2.method();

        System.out.println("instance1: publicField = " + instance1.getValue() + "    instance2: publicField = " + instance2.getValue());
    }
    }

