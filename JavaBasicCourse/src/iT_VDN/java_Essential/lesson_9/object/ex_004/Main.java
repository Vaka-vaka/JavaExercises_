/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2023-10-31
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_9.object.ex_004;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        // создаем объкты с одинаковыми параметрами
        Car car1 = new Car(2);
        Car car2 = new Car(2);
        Car car3 = car1;

        // метод equals сравнивает уже по инструкции, которую мы описали в перезаписанном методе сравниваемого класса
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
    }
}
