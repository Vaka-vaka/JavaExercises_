/**
 * Demonstration of Type Casting
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_2;

public class CastDemo {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x / y);
        System.out.println("Цeлoчиcлeнный результат деления х / у: " + i);
        i = 100;
        b = (byte) i;
        System.out.println("Знaчeниe b : " + b);
        i = 257;
        b = (byte) i; //інформаця пропада бо байт менше 257
        System.out.println("Знaчeниe b : " + b);
        b = 88;
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}
