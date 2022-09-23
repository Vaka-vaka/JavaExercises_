/**
 * This program creates two objects of the Vehicle class
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_4;

class TwoVehicles {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
public static void main(String[] args) {
        TwoVehicle minivan = new TwoVehicle();
        TwoVehicle sportscar = new TwoVehicle();
        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Mини-фypгoн может перевезти " + minivan.passengers +
                " пассажиров на расстояние " + range1 + " миль.");
        System.out.println("Cпopтивный автомобиль может перевезти " + sportscar.passengers +
                " пассажиров на расстояние " + range2 + " миль.");
    }
}

class TwoVehicle {
    int passengers;
    int fuelcap;
    int mpg;
}
