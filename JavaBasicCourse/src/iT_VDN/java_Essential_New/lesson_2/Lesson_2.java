/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-11-22
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_2;


import iT_VDN.java_Essential_New.lesson_2.test.Car;

public class Lesson_2 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
//        MyClass myClass = new MyClass();
//        Rectangle rectangle = new Rectangle();
//        Car car = new Car();
//        Main main = new Main();

        Car car = new Car("audi", 2002, "green", "q7");
      //  car.brand = "BMW";
//        car.color = "white";
//        car.year = 2022;
      //  car.model = "x5";
//        car.showInfo();

        //паттерни
        Car car1 = new Car()
                .addModel("KIA")
                .addYear(1990);
        car1.showInfo();
    }
}
