/**
 * Создайте подкласс Circle, производный от класса TwoDShapeCircle.
 * В нем должен быть определен метод area(), вычисляющий площадь круга,
 * а также конструктор с ключевым словом super для инициализации членов,
 * унаследованных от класса TwoDShapeCircle
 *
 * @author Valentyn Mozul
 * @version 1.0 from 20.01.2023
 */

package chapter_7;

abstract class TwoDShapeCircle {
    private double radius;
    private double diameter;
    private double area;
    private String n;
    private final double pi = 3.14159265;

    TwoDShapeCircle(double r){
        radius = r;
    }

    TwoDShapeCircle(double d, String s){
        diameter = d;
        n = s;
    }

    TwoDShapeCircle(String s , double a){
        area = a;
        n = s;
    }

    double getRadius(){
        return radius;
    }

    void setRadius(double r){
        radius = r;
    }

    double getPi(){
        return pi;
    }

    double getDiameter(){
        return diameter;
    }

    String getN(){
        return n;
    }

    double getArea(){
        return area;
    }

    abstract double area();
    abstract double areaDiameter();

    abstract double diameter();
}

class Circle extends TwoDShapeCircle{

    Circle(double r){
        super(r);
    }

    Circle(double d, String s){
        super(d, s);
    }

    Circle(String s, double a){
        super(s, a);
    }

    double area() {
        return getPi() * (getRadius() * getRadius());
    }

    double areaDiameter(){
        return getPi() * (getDiameter() / 2) * 2;
    }

    double diameter() {
        return ((2 * getArea()) / getPi()) / 2;
    }

    double radius(){
        return (getArea() / getPi()) / 5;
    }
}

class CircleDemo{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Areas circle = " + circle.area());

        Circle circle1 = new Circle(25,  "площа");
        System.out.println("Areas circle diameter = " + circle1.areaDiameter());

        Circle circle2 = new Circle("diametr" , circle1.areaDiameter());
        System.out.println("Diameter = " + circle2.diameter());

        Circle circle3 = new Circle("radius ", circle1.areaDiameter());
        System.out.println("Radius " + circle3.radius());
    }
}
