/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.generic.ex_004;

abstract class Shape {
}

class Circle extends Shape {
}

interface IContainer<T> {
    T getFigure();

    void setFigure(T figure);
}

class Container<T> implements IContainer<T> {
    private T figure;

    public Container(T figure) {
        this.figure = figure;
    }

    public T getFigure() {
        return figure;
    }

    public void setFigure(T figure) {
        this.figure = figure;
    }
}

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle();

        IContainer<Circle> container = new Container<>(circle);

        System.out.println(container.getFigure().toString());
    }
}
