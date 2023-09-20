/**
 * Using access methods to set and
 * to retrieve values of closed members
 *
 * @author Valentyn Mozul
 * @version 1.0 from 22.12.2022
 */

package java.Herbert_Shield.chapter_7;

public class TwoDShape2 {
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
        System.out.println(" Шиpинa и высота - " + width + " и " +
                height);
    }
}

class Triangle2 extends TwoDShape2 {
    String style;

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void style() {
        System.out.println("Tpeyгoльник " + style);
    }
}

class TwoDShape2Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        TwoDShape2 t = new TwoDShape2();
        t.showDim();
        t.setWidth(1.5);
        t.setHeight(5.0);
        t.showDim();

        Triangle2 tr1 = new Triangle2();
        Triangle2 tr2 = new Triangle2();

        tr1.style = "закрашенный";
        tr1.setWidth(10.0);
        tr1.setHeight(10.0);

        tr2.style = "контурный";
        tr2.setWidth(5.0);
        tr2.setHeight(5.0);

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
