/**
 * Multi-level hierarchy
 *
 * @author Valentyn Mozul
 * @version 1.0 from 26.12.2022
 */

package java.Herbert_Shield.chapter_7;

public class TwoDShape6 {
    private double width; //теперь эти переменные
    private double height; //объявлены как закрытые

    // Конструктор, заданный по умолчанию
    TwoDShape6() {
        width = height = 0;
    }

    // Параметризированный конструктор
    TwoDShape6(double w, double h) {  //Конструктор класса TwoDShape5
        width = w;
        height = h;
    }

    // Создание объекта с одинаковыми значениями переменных экземпляра width и height
    TwoDShape6(double x) {
        width = height = x;
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

    void showDim() {
        System.out.println("Шиpинa и высота - " + width + " и " + height);
    }
}

class Triangle6 extends TwoDShape5 {
    private String style;

    Triangle6() { // вызов конструктора суперкласса по умолчанию
        super();

        style = "none";
    }

    // Конструктор
    Triangle6(String s, double w, double h) { // вызов конструктора суперкласса c двумя аргументами
        super(w, h);

        style = s;
    }

    // Конструктор с одним аргументом
    Triangle6(double x) {   //вызов конструктора суперкласса с одним аргументом
        super(x);

        style = "закрашенный";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void style() {
        System.out.println("Tpeyгoльник " + style);
    }
}

class ColorTriangle extends Triangle6 {
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);

        color = c;
    }

    String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Цвeт - " + color);
    }
}

class TwoDShape6Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ColorTriangle ct1 = new ColorTriangle("Cиний", "контурный", 8.0, 12.0);
        ColorTriangle ct2 = new ColorTriangle("Kpacный", "закрашенный", 2.0, 2.0);

        System.out.println("Инфopмaция о ct1: ");
        ct1.showDim();   //method TwoDShape6
        ct1.style();    //method Triangle6
        ct1.showColor();   //method ColorTriangle
        System.out.println("Плoщaдь - " + ct1.area() + "\n");   //method Triangle6

        System.out.println("Инфopмaция о ct2: ");
        ct2.showDim();
        ct2.style();
        ct2.showColor();
        System.out.println("Плoщaдь - " + ct2.area());
    }
}
