/**
 * Both classes have constructors that receive
 * object of its class as a parameter
 *
 * @author Valentyn Mozul
 * @version 1.0 from 26.12.2022
 */

package java.Herbert_Shield.chapter_7;

public class TwoDShape7 {
    private double width; //теперь эти переменные
    private double height; //объявлены как закрытые

    // Конструктор, заданный по умолчанию
    TwoDShape7() {
        width = height = 0;
    }

    // Параметризированный конструктор
    TwoDShape7(double w, double h) {  //Конструктор класса TwoDShape5
        width = w;
        height = h;
    }

    // Создание объекта с одинаковыми значениями переменных экземпляра width и height
    TwoDShape7(double x) {
        width = height = x;
    }

    //Создание одного объекта на основе другого
    TwoDShape7(TwoDShape7 ob) {
        width = ob.width;
        height = ob.height;
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

class Triangle7 extends TwoDShape7 {
    private String style;

    Triangle7() { // вызов конструктора суперкласса по умолчанию
        super();

        style = "none";
    }

    // Конструктор
    Triangle7(String s, double w, double h) { // вызов конструктора суперкласса c двумя аргументами
        super(w, h); // вызов конструктора суперкласса

        style = s;
    }

    // Конструктор с одним аргументом
    Triangle7(double x) {   //вызов конструктора суперкласса с одним аргументом
        super(x);

        style = "закрашенный";
    }

    //Создание одного объекта на основе другого
    Triangle7(Triangle7 ob) {
        super(ob);

        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void style() {
        System.out.println("Tpeyгoльник " + style);
    }
}

class ColorTriangle2 extends Triangle7 {
    private String color;

    ColorTriangle2(String c, String s, double w, double h) {
        super(s, w, h);

        color = c;
    }

    //Создание одного объекта на основе другого
    ColorTriangle2(ColorTriangle2 ob) {
        super(ob);

        color = ob.color;
    }

    String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Цвeт - " + color);
    }
}

class TwoDShape7Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ColorTriangle2 ct1 = new ColorTriangle2("Cиний", "контурный", 8.0, 12.0);
        ColorTriangle2 ct2 = new ColorTriangle2(ct1);

        System.out.println("Инфopмaция о ct1: ");
        ct1.showDim();   //method TwoDShape7
        ct1.style();    //method Triangle7
        ct1.showColor();   //method ColorTriangle2
        System.out.println("Плoщaдь - " + ct1.area() + "\n");   //method Triangle7

        System.out.println("Инфopмaция о ct2: ");
        ct2.showDim();
        ct2.style();
        ct2.showColor();
        System.out.println("Плoщaдь - " + ct2.area() + "\n");

        Triangle7 triangle7 = new Triangle7("Hay ", 5, 10);
        Triangle7 triangle2 = new Triangle7(triangle7);

        triangle7.showDim();
        triangle7.style();
        System.out.println("Плoщaдь - " + triangle7.area() + "\n");

        triangle2.showDim();
        triangle2.style();
        System.out.println("Плoщaдь - " + triangle2.area());
    }
}
