/**
 * java basic
 * lesson 1
 *
 * @version 1.0 from 2023-11-21
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_1;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
    }

    Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getAreaCalculator() {
        return width * height;
    }

    public double getPerimeterCalculator() {
        return 2 * (width + height);
    }
}
