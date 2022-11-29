/**
 * Method overloading
 *
 * @author Valentyn Mozul
 * @version 1.0 from 19.11.2022
 */

package chapter_6;

public class OverLoad {
    void overDemo() {  //Первая версия
        System.out.println("Бeз параметров");
    }

    void overDemo(int a) {  //Вторая версия
        System.out.println("Oдин параметр : " + a);
    }

    int overDemo(int a, int b) {  //Третья версия
        System.out.println("Двa параметра : " + a + " + " + b);
        return a + b;
    }

    double overDemo(double a, double b) {  //Четвертая версия
        System.out.println("Двa параметра типа double " + a + " + " + b);
        return a + b;
    }

    double overDemo(double a) {
        System.out.println("Oдин параметр : " + a);
        return (a * a);
    }
}

class OverLoadDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        OverLoad load = new OverLoad();
        load.overDemo();
        load.overDemo(2);
        System.out.println(load.overDemo(2, 3));
        System.out.println(load.overDemo(1.1, 1.1));
        System.out.println(load.overDemo(2.2));
    }
}
