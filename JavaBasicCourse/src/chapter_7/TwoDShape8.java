/**
 * Use of dynamic dispatching methods
 *
 * @author Valentyn Mozul
 * @version 1.0 from 16.01.2023
 */

package chapter_7;

public class TwoDShape8 {
    private double width;
    private double height;
    private String name;

    //Конструктор по умолчанию
    TwoDShape8() {
        width = height = 0.0;
        name = "none";
    }

    //Параметризированный конструктор
    TwoDShape8(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    //Создание объекта с одинаковыми значениями
    //переменных экземпляра width и height
    TwoDShape8(double x, String n) {
        width = height = x;
        name = n;
    }

    //Создание одного объекта на основе другого
    TwoDShape8(TwoDShape8 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Шиpинa и высота - " + width + " i " + height);
    }

    double area() {
        System.out.println("Meтoд area() должен быть переопределен");
        return 0.0;
    }
}

// Подкласс для представления треугольников ,
// производный от класса TwoDShape
class Triangle8 extends TwoDShape8 {
    private String style;

    Triangle8() { // вызов конструктора суперкласса по умолчанию
        super();

        style = "none";
    }

    // Конструктор
    Triangle8(String s, double w, double h) { // вызов конструктора суперкласса c двумя аргументами
        super(w, h, "треугольник"); // вызов конструктора суперкласса

        style = s;
    }

    // Конструктор с одним аргументом
    Triangle8(double x) {   //вызов конструктора суперкласса с одним аргументом
        super(x, "треугольник");

        style = "закрашенный";
    }

    //Создание одного объекта на основе другого
    Triangle8(Triangle8 ob) {
        super(ob); // передача объекта конструктору класса TwoDShape8

        style = ob.style;
    }

    //Переопределение метода area() для класса Triangle8
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Tpeyгoльник " + style);
    }
}

//Подкласс для представления прямоуголь ников ,
// производный от класса TwoDShape8
class Rectangle8 extends TwoDShape8 {
    Rectangle8() {
        super();
    }

    // Конструктор класса Rectangle
    Rectangle8(double w, double h) {
        super(w, h, "прямоугольник"); //вызов конструктора суперкласса
    }

    //Создание квадрата
    Rectangle8(double x) {
        super(x, "прямоугольник"); //вызов конструктора суперкласса
    }

    //Создание одного объекта на основе другого
    Rectangle8(Rectangle8 ob) {
        super(ob); //передача объекта конструктору класса TwoDShape8
    }

    boolean isSquare() {
        if (getHeight() == getWidth()) return true;
        return false;
    }

    //Переопределение метода area () для класса Rectangle
    double area() {  //Переоnрелеление метода area() для класса Reactangle
        return getWidth() * getHeight();
    }
}

class TwoDShape8Demo {
    public static void main(String[] args) {
        TwoDShape8[] twoDShape8 = new TwoDShape8[5];

        twoDShape8[0] = new Triangle8("контурный", 8.0, 12.0);
        twoDShape8[1] = new Triangle8(7.0);
        twoDShape8[2] = new Rectangle8(10);
        twoDShape8[3] = new Rectangle8(10, 4);

        twoDShape8[4] = new TwoDShape8(10, 20, "фигура");
        for (TwoDShape8 dShape8 : twoDShape8) {
            System.out.println("Oбъeкт - " + dShape8.getName());
            System.out.println("Плoщaдь - " + dShape8.area());
            System.out.println();
        }
    }
}

