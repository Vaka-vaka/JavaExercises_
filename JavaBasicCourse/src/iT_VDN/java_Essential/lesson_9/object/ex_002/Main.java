/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2023-10-30
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_9.object.ex_002;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Car car = new Car(160, "blue");

        // возвращает класс объекта
        System.out.println(car.getClass());

        // благодар¤ перезаписаному методу toString выведет информацию в нужном нам виде
        System.out.println(car);
    }
}
