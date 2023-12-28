/**
 * java basic
 * lesson 3
 *
 * @version 1.0 from 2023-09-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_3;

public class Plane extends Vehicle {
    public int height;
    public int numberPassengers;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }
}
