/**
 * References to superclass and subclass objects
 *
 * @author Valentyn Mozul
 * @version 1.0 from 26.12.2022
 */

package chapter_7;

public class X {
    int x;

    X(int i) {
        x = i;
    }
}

class Y extends X {
    int y;

    Y(int a, int b) {
        super(b);

        y = a;
    }
}

class XY {
    public static void main(String[] args) {
        X x1 = new X(10);
        X x2;

        Y y1 = new Y(5, 10);

        x2 = x1; // допустимо, поскольку обе переменные одного типа
        System.out.println("x2.x - " + x2.x);

        x2 = y1; // по-прежнему допустимо по указанной выше причине
        System.out.println("x2.y - " + x2.x);

        x2.x = 19;
        // x2.y = 23;
    }
}
