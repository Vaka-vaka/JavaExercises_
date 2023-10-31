/**
 * java basic
 * lesson 6
 *
 * @version 1.0 from 2023-10-09
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_6.homeWork_1;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle.Door door = new Vehicle().new Door();
        wheel.print();
        door.print();
    }
}
