/**
 * java basic
 * lesson 1
 *
 * @version 1.0 from 2023-11-21
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_1;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 11);
        System.out.println("Area = " + rectangle.getAreaCalculator());
        System.out.println("Perimeter = " + rectangle.getPerimeterCalculator());
    }
}
