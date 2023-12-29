/**
 * java basic
 * lesson 5
 *
 * @version 1.0 from 2023-12-13
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_5.home_work_2;

public class MainMath {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        int suma = MathUtils.addNumbers(20, 30);
        System.out.println(suma);

        System.out.println("Завдання 2");
        System.out.println(Constants.SPEED_LIGHT);
        System.out.println(Constants.PI);

        System.out.println("Завдання 3");
        DayOfWeek.isWeekend("Понеділок");
        DayOfWeek.isWeekend("Субота");

        System.out.println("Завдання 4");
        ArrayInitializer initializer = new ArrayInitializer();
        initializer.printNumbers();
    }
}
