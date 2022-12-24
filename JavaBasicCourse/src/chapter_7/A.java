/**
 * Using the super keyword to prevent hiding names
 *
 * @author Valentyn Mozul
 * @version 1.0 from 22.12.2022
 */

package chapter_7;

public class A {
    int i;

    void show() {
        System.out.println("i в суперклассе : " + i);
    }
}

class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i в суперклассе : " + super.i);
        System.out.println("i в подклассе : " + i);
        super.show();
    }
}

class ADemoB {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B(1, 4);
        a1.show();
        b1.show();
    }
}
