/**
 * Adding a constructor to the Triangle class
 *
 * @author Valentyn Mozul
 * @version 1.0 from 22.12.2022
 */

package chapter_7;

public class TwoDShape3 {
    private double width; //теперь эти переменные
    private double height; //объявлены как закрытые

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

class Triangle3 extends TwoDShape3 {
    private String style;

    Triangle3(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void style() {
        System.out.println("Tpeyгoльник " + style);
    }
}

class TwoDShape3Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        TwoDShape3 t = new TwoDShape3();
        t.showDim();
        t.setWidth(1.5);
        t.setHeight(5.0);
        t.showDim();
        System.out.println();

        Triangle3 tr1 = new Triangle3("закрашенный", 10.0, 10.0);
        Triangle3 tr2 = new Triangle3("контурный", 5.0, 5.0);

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
