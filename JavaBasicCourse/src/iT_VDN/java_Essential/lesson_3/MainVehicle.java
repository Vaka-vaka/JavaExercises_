/**
 * java basic
 * lesson 3
 *
 * @version 1.0 from 2023-09-12
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_3;

public class MainVehicle {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Bmw");
        car.setWeight(1500);
        car.setPrice(21000);
        car.setCoordinates("Kyiv");
        car.setSpeed(270);
        car.setYearProduction(2015);
        System.out.println("Car: " +
                "Model - " + car.getModel() + "; " +
                "YearProduction - " + car.getYearProduction() + "; " +
                "Speed - " + car.getSpeed() + "; " +
                "Weight - " + car.getWeight() + "; " +
                "Price - " + car.getPrice() + "; " +
                "Coordinates - " + car.getCoordinates()
        );
        System.out.println("___+++++_____");

        Plane plane = new Plane();
        plane.setHeight(3500);
        plane.setNumberPassengers(35);
        plane.setCoordinates("Poltava");
        plane.setSpeed(750);
        plane.setYearProduction(2021);
        plane.setPrice(160000);
        System.out.println("Plane: " +
                "Height - " + plane.getHeight() + "; " +
                "YearProduction - " + plane.getYearProduction() + "; " +
                "Speed - " + plane.getSpeed() + "; " +
                "NumberPassengers - " + plane.getNumberPassengers() + "; " +
                "Price - " + plane.getPrice() + "; " +
                "Coordinates - " + plane.getCoordinates()
        );
        System.out.println("__++++____++++++");

        Ship ship = new Ship();
        ship.setYearProduction(2011);
        ship.setNumberPassengersShip(2300);
        ship.setPortResidence("Odessa");
        ship.setCoordinates("Turkey");
        ship.setPrice(1453000);
        ship.setSpeed(90);
        System.out.println("Ship: " +
                "PortResidence - " + ship.getPortResidence() + "; " +
                "YearProduction - " + ship.getYearProduction() + "; " +
                "Speed - " + ship.getSpeed() + "; " +
                "NumberPassengersShip - " + ship.getNumberPassengersShip() + "; " +
                "Price - " + ship.getPrice() + "; " +
                "Coordinates - " + ship.getCoordinates()
        );
    }
}
