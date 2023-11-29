/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2023-11-01
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_9.object.ex_006;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Car car1 = new Car("1", 12, 1.8F);
        Car car2 = new Car("2", 21, 1.6F);
        Car car3 = new Car("3", 10, 1.4F);

        //вывод хэш-кодов
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
