/**
 * Adding additional constructors to the TwoDShape5 class
 *
 * @author Valentyn Mozul
 * @version 1.0 from 22.12.2022
 */

package java.Herbert_Shield.chapter_7;

public class TwoDShape5 {
    private double width; //теперь эти переменные
    private double height; //объявлены как закрытые

    // Конструктор, заданный по умолчанию
    TwoDShape5() {
        width = height = 0;
    }

    // Параметризированный конструктор
    TwoDShape5(double w, double h) {  //Конструктор класса TwoDShape5
        width = w;
        height = h;
    }

    // Создание объекта с одинаковыми значениями переменных экземпляра width и height
    TwoDShape5(double x) {
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

class Triangle5 extends TwoDShape5 {
    private String style;

    Triangle5() { // вызов конструктора суперкласса по умолчанию
        super();
        style = "none";
    }

    // Конструктор
    Triangle5(String s, double w, double h) { // вызов конструктора суперкласса c двумя аргументами
        super(w, h);
        style = s;
    }

    // Конструктор с одним аргументом
    Triangle5(double x) {   //вызов конструктора суперкласса с одним аргументом
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

class TwoDShape5Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        TwoDShape5 t1 = new TwoDShape5();
        TwoDShape5 t2 = new TwoDShape5(4.5, 4.6);
        TwoDShape5 t3 = new TwoDShape5(2.0);
        System.out.println("Инфopмaция о t1 :");
        t1.showDim();
        System.out.println();
        System.out.println("Инфopмaция о t2 :");
        t2.showDim();
        System.out.println();
        System.out.println("Инфopмaция о t3 :");
        t3.showDim();
        System.out.println();

        Triangle5 tr1 = new Triangle5();
        Triangle5 tr2 = new Triangle5("контурный", 5.0, 8.0);
        Triangle5 tr3 = new Triangle5(5.0);

        System.out.println("Инфopмaция о tr1 :");
        tr1.showDim();
        tr1.style();
        System.out.println("Плoщaдь - " + tr1.area());
        System.out.println();

        System.out.println("Инфopмaция о tr2 :");
        tr2.showDim();
        tr2.style();
        System.out.println("Плoщaдь - " + tr2.area());
        System.out.println();

        System.out.println("Инфopмaция о tr3 :");
        tr3.showDim();
        tr3.style();
        System.out.println("Плoщaдь - " + tr3.area());
    }
}
