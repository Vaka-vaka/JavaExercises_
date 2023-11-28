/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2023-10-30
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_9.object.ex_003;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Car car1 = new Car(2);
        Car car2 = new Car(2);
        Car car3 = car1;

        // сравниваем по ссылкам (разные объекты)
        System.out.println(car1.equals(car2));

        // ссылаемся на один и тот же объект
        System.out.println(car1.equals(car3));

        System.out.println(car1 == car2);

        System.out.println(car1 == car3);
    }
}
