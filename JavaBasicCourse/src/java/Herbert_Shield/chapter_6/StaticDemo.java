/**
 * Applying the Static Variable
 *
 * @author Valentyn Mozul
 * @version 1.0 from 04.12.2022
 */

package java.Herbert_Shield.chapter_6;

public class StaticDemo {
    int x; // обычная переменная экземпляра
    static int y;  // статическая переменная

    // Возврат суммы значений переме нной экземпляра х и
    // статиче ской переменной у
    int sum() {
        return x + y;
    }
}

class SDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        StaticDemo staticDemo1 = new StaticDemo();

        // У каждого объекта имеется своя копия
        // переменной экземпляра
        staticDemo.x = 10;
        staticDemo1.x = 20;
        System.out.println("Paзyмeeтcя, staticDemo.х и staticDemo1.х " +
                " не зависимы");
        System.out.println("staticDemo.x " + staticDemo.x + "\nstaticDemo1 " + staticDemo1.x);
        System.out.println();

        // Все объекты совместно исполь зуют одну общую
        // копию статической переменной
        System.out.println("Cтaтичecкaя переменная у - общая");
        StaticDemo.y = 19;
        System.out.println("Пpиcвoить StaticDemo.y значение 19");
        System.out.println("y = " + StaticDemo.y);
        System.out.println("staticDemo.sum() = " + staticDemo.sum() +
                "\nstaticDemo1.sum() = " + staticDemo1.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("Измeнить значение StaticDemo.y на 100");
        System.out.println("y = " + StaticDemo.y);
        System.out.println("staticDemo.sum() = " + staticDemo.sum() +
                "\nstaticDemo1.sum() = " + staticDemo1.sum());
        System.out.println();
    }
}
