/**
 * Demonstration of the order in which constructors are called
 *
 * @author Valentyn Mozul
 * @version 1.0 from 26.12.2022
 */

package java.Herbert_Shield.chapter_7;

public class A1 {
    //Создание суперкласса
    A1() {
        System.out.println("Koнcтpyктop А1");
    }
}

class B1 extends A1 {
    //Создание подкласса в результате ра сширения кла сса А1
    B1() {
        System.out.println("Koнcтpyктop B1");
    }
}

class C1 extends B1 {
    //Создание подкласса в результате расширения класса В1
    C1() {
        System.out.println("Koнcтpyктop C1");
    }
}

class DemoABC {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        C1 c1 = new C1();
    }
}