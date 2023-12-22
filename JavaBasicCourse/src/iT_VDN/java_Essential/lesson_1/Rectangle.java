/**
 * java basic
 * lesson 1
 *
 * @author Valentyn Mozul
 * @version 1.0 from 29.08.2023
 */

package iT_VDN.java_Essential.lesson_1;

public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getAreaCalculator1(){
        return getSide1() * getSide2();
    }

    public double getPerimeterCalculator1() {
        return (2 * (getSide1() + getSide2()));
    }

    public double getAreaCalculator(double a, double b) {
        return a * b;
    }

    public double getPerimeterCalculator(double side1, double side2) {
        return (2 * (side1 + side2));
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 9);
//        rectangle.setSide1(6);
//        rectangle.setSide2(11);
        System.out.println("Площа прямокутника_1 = " + rectangle.getAreaCalculator1());
        System.out.println("Периметр прямокутника_1 = " + rectangle.getPerimeterCalculator1());

        double area = rectangle.getAreaCalculator(4, 10);
        System.out.println("Площа прямокутника = " + area);

        double perimeter = rectangle.getPerimeterCalculator(4, 10);
        System.out.println("Периметр прямокутника = " + perimeter);
    }
}
