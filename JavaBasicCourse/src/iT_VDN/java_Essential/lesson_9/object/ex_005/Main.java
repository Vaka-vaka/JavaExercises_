/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2023-10-31
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_9.object.ex_005;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        // создаем объекты, 2 из них содержат одинаковые параметры
        Car car1 = new Car(12);
        Car car2 = new Car(12);
        Car car3 = new Car(15);

        // вызываем метод hashCode, каков будет результат?
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
