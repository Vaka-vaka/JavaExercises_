/**
 * java basic
 * lesson 5
 *
 * @version 1.0 from 2023-12-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_5.lesson5;

public class Engine {
    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                '}';
    }
}
