/**
 * The automatic type conversion can influence
 * the choice of the method to be converted.
 *
 * @author Valentyn Mozul
 * @version 1.0 from 21.11.2022
 */

package chapter_6;

public class OverLoad2 {
    void b(byte a) {
        System.out.println("Bнyтpи b (byte): " + a);
    }

    void f(int a) {
        System.out.println("Bнyтpи f (int): " + a);
    }

    void d(double a) {
        System.out.println("Bнyтpи d (double): " + a);
    }
}

class OverDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        OverLoad2 load2 = new OverLoad2();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 10.5f;

        load2.f(i);
        load2.d(d);

        load2.b(b);
        load2.f(s);
        load2.d(f);
    }
}
