/**
 * Демонстрация динамической диспетчеризации методов
 *
 * @author Valentyn Mozul
 * @version 1.0 from 27.12.2022
 */

package chapter_7;

public class Sup {
    void who() {
        System.out.println("who() в Sup");
    }
}

class Sub1 extends Sup {
    void who() {
        System.out.println("who() в Sub1");
    }
}

class Sub2 extends Sup {
    void who() {
        System.out.println("who() в Sub2");
    }
}

class SupDemo {
    public static void main(String[] args) {
        Sup sup = new Sup();
        Sub1 sub1 = new Sub1();
        Sub2 sub2 = new Sub2();

        Sup supRef;

        supRef = sup;
        supRef.who();

        supRef = sub1;
        supRef.who();

        supRef = sub2;
        supRef.who();
    }
}
