/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-12-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_4.lesson4;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
