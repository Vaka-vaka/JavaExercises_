/**
 * Greate class Car
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.03.2023
 */

package JavaKids;

public class Car {

    public static void start() {
        System.out.println("Поїхали !!!");
    }

    public void stop() {
        System.out.println("Зупинимося !!!");
    }

    public int drive(int howlong) {
        return howlong * 60;
    }
}

class JamesBondCar {
    public int drive(int howlong) {
        return howlong * 180;
    }
}

class CarOwner {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        int distance = car.drive(3);
        System.out.println("Проїхали " + distance + " км");
        car.stop();
        System.out.println();
        JamesBondCar jbc = new JamesBondCar();
        int distanceJBC = jbc.drive(10);
        System.out.println("Проїхали " + distanceJBC + " км");
    }
}