/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-12-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_4.lesson4;

public class Lesson_4 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int number = 42;
        double decimaNumber = number;
        System.out.println(decimaNumber);

        long longNumber = number;
        System.out.println(longNumber);

        double d = 3.14;
        int number1 = (int) d;
        System.out.println(number1);

        long bigNumber = 10000;
        byte smallNumber = (byte) bigNumber;
        System.out.println(smallNumber);


        Circle circle = new Circle(3);
        Shape shape = circle;

    }
}
