/**
 * Переопределение метода
 *
 * @author Valentyn Mozul
 * @version 1.0 from 26.12.2022
 */

package java.Herbert_Shield.chapter_7;

public class A3 {
    int i, j;

    A3(int a, int b) {
        i = a;
        j = b;
    }

    //Отображение переменных i и j
    void show() {
        System.out.println("i and j " + i + " " + j);
    }
}

class B3 extends A3 {
    int k;

    B3(int a, int b, int c) {
        super(a, b);

        k = c;
    }

    //     Отображение переменной k - переопределение метода show() в А2
    void show1() {
        super.show();
        System.out.println("k " + k);
    }

    void show2(String msg) {
        System.out.println(msg + k);
    }
}

class Override2 {
    public static void main(String[] args) {
        B3 a2 = new B3(1, 2, 3);
        a2.show(); //вызов метода show() из класса A3
        a2.show1(); //вызов метода show() из класса В3
        a2.show2("k - "); //вызов метода show() из класса В3
    }
}