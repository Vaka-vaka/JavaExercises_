/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-12-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_4.lesson4;

public class Rectangle extends Shape {
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return lenght * width;
    }
}
