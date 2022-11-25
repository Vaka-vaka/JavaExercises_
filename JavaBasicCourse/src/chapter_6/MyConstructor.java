/**
 * Demonstration of constructor overload
 *
 * @author Valentyn Mozul
 * @version 1.0 from 21.11.2022
 */

package chapter_6;

public class MyConstructor {
    int x;

    MyConstructor() {
        System.out.println("Bнyтpи MyConstructor().");
        x = 0;
    }

    MyConstructor(int a) {
        System.out.println("Bнyтpи MyConstructor(int).");
        x = a;
    }

    MyConstructor(double a) {
        System.out.println("Bнyтpи MyConstructor(double).");
        x = (int) a;
    }

    MyConstructor(int a, int b) {
        System.out.println("Bнyтpи MyConstructor (int, int).");
        x = a * b;
    }
}

class MyConstructorDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyConstructor myConstructor = new MyConstructor();
        MyConstructor myConstructor1 = new MyConstructor(10);
        MyConstructor myConstructor2 = new MyConstructor(4.4);
        MyConstructor myConstructor3 = new MyConstructor(4, 5);

        System.out.println("myConstructor - " + myConstructor.x);
        System.out.println("myConstructor1 - " + myConstructor1.x);
        System.out.println("myConstructor2 - " + myConstructor2.x);
        System.out.println("myConstructor3 - " + myConstructor3.x);
    }
}
