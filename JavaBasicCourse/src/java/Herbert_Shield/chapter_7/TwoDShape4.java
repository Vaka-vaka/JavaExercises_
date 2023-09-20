/**
 * Adding constructors to the TwoDShape4 class
 *
 * @author Valentyn Mozul
 * @version 1.0 from 22.12.2022
 */

package java.Herbert_Shield.chapter_7;

public class TwoDShape4 {
    private double width; //теперь эти переменные
    private double height; //объявлены как закрытые

    // Параметризированный конструктор
    TwoDShape4(double w, double h) {  //Конструктор класса TwoDShape4
        width = w;
        height = h;
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

class Triangle4 extends TwoDShape4 {
    private String style;

    Triangle4(String s, double w, double h) {
        super(w, h);  // Использование оператора super() для вызова конструктора класса TwoDShape4
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void style() {
        System.out.println("Tpeyгoльник " + style);
    }
}

class TwoDShape4Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        TwoDShape4 t = new TwoDShape4(1.5, 5.0);
        System.out.println("Инфopмaция о t :");
        t.showDim();
        System.out.println();

        Triangle4 tr1 = new Triangle4("закрашенный", 10.0, 10.0);
        Triangle4 tr2 = new Triangle4("контурный", 5.0, 5.0);

        System.out.println("Инфopмaция о tr1 :");
        tr1.showDim();
        tr1.style();
        System.out.println("Плoщaдь - " + tr1.area());
        System.out.println();

        System.out.println("Инфopмaция о tr2 :");
        tr2.showDim();
        tr2.style();
        System.out.println("Плoщaдь - " + tr2.area());
    }
}
