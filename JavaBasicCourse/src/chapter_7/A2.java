/**
 * Переопределение метода
 *
 * @author Valentyn Mozul
 * @version 1.0 from 26.12.2022
 */

package chapter_7;

public class A2 {
    int i, j;

    A2(int a, int b) {
        i = a;
        j = b;
    }

    //Отображение переменных i и j
    void show() {
        System.out.println("i and j " + i + " " + j);
    }
}

class B2 extends A2 {
    int k;

    B2(int a, int b, int c) {
        super(a, b);

        k = c;
    }

    //     Отображение переменной k - переопределение метода show() в А2
    void show() {
        System.out.println("k " + k);
    }
}

class Override {
    public static void main(String[] args) {
        B2 a2 = new B2(1, 2, 3);
        a2.show(); //вызов метода show() из класса В
    }
}