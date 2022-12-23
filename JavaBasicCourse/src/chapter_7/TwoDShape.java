/**
 * A simple hierarchy of classes
 * A class that describes two-dimensional objects
 *
 * @author Valentyn Mozul
 * @version 1.0 from 20.12.2022
 */

package chapter_7;

public class TwoDShape {
    double whidth;
    double height;
    String style;

    void showDim() {
        System.out.println("Шиpинa и высота - " + whidth + " and " + height);
    }
}

// Подкласс для представления треугольни ко в ,
// производный от класса TwoDShape
class Triangle extends TwoDShape {
    double area() {
        return whidth * height / 2;
    }

    void ShowStyle() {
        System.out.println("Tpeyгoльник " + style);
    }
}

// Подкласс для представления прямоугольников, производный от класса TwoDShape
class Rectangle extends TwoDShape {
    boolean isSquare() {
        return whidth == height;
    }

    double area() {
        return whidth * height;
    }

    void ShowStyle() {
        if (whidth == height) {
            System.out.println("Квадрат " + style);
        } else {
            System.out.println("Прямоугольник " + style);
        }
    }
}

class TwoDShapeDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        triangle1.height = 4.0;
        triangle1.whidth = 4.0;
        triangle1.style = "закрашенный";

        triangle2.whidth = 8.0;
        triangle2.height = 12.0;
        triangle2.style = "контурный";

        System.out.println("Инфopмaция о triangle1:");
        triangle1.ShowStyle();
        triangle1.showDim();
        System.out.println("Плoщaдь - " + triangle1.area());

        System.out.println();

        System.out.println("Инфopмaция о triangle2:");
        triangle2.ShowStyle();
        triangle2.showDim();
        System.out.println("Плoщaдь - " + triangle2.area());
        System.out.println();

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle1.style = "Чорный";
        rectangle1.whidth = 4.0;
        rectangle1.height = 4.0;

        rectangle2.style = "Зеленый";
        rectangle2.whidth = 8.0;
        rectangle2.height = 9.0;

        System.out.println("Инфopмaция о rectangle1:");
        rectangle1.ShowStyle();
        System.out.println("Являеться прямоугольник квадратом - " + rectangle1.isSquare());
        System.out.println("Плoщaдь - " + rectangle1.area());
        System.out.println();

        System.out.println("Инфopмaция о rectangle2:");
        rectangle2.ShowStyle();
        System.out.println("Являеться прямоугольник квадратом - " + rectangle2.isSquare());
        System.out.println("Плoщaдь - " + rectangle2.area());
    }
}
