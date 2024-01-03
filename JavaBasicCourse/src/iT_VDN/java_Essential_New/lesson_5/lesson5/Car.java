/**
 * java basic
 * lesson 5
 *
 * @version 1.0 from 2023-12-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_5.lesson5;

public class Car {
    private static int totalCars = 0;
    private final String brand;
    private final int year;

    private final Engine engine;

    public Car(String brand, int year, Engine engine) {
        this.brand = brand;
        this.year = year;
        this.engine = engine;
        totalCars++;
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public static void setTotalCars(int totalCars) {
        Car.totalCars = totalCars;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }
}
