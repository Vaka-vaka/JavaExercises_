/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2023-10-30
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_9.object.ex_001;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        // Создали объект класса Car. У него уже есть методы класса Object.
        Main main = new Main();

        // объект класса Car тоже имеет методы класса Object
        Car c = new Car();

    }
}

// класс Car явно наследуется от класса Object
class Car extends Object {

}
