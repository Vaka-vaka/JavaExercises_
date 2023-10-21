/**
 * java basic
 * lesson 3
 *
 * @version 1.0 from 2023-09-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_3;

public abstract class Vehicle {
    public String coordinates;
    public int price;
    public int speed;
    public int yearProduction;

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }
}
