/**
 * Adding a parameterized method that calculates the
 * amount of fuel a vehicle needs to cover a given
 * distance to cover a given distance
 *
 * @author Valentyn Mozul
 * @version 1.0 from 27.09.2022
 */

package chapter_4;

public class FourVehicles {
    int passengers;
    int fuelcap;
    int mpg;

    // Определение дальности поездки транспортного средства
    int range(){
        return mpg * fuelcap;
    }

    // Расчет количества топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }
}

class CompFuel{
/**
 * Program entry point.
 *
 * @param args command Line arguments
 */
    public static void main(String[] args) {
        FourVehicles minivan = new FourVehicles();
        FourVehicles sportscar = new FourVehicles();
        int dist = 500;
        int rangge1, rangge2;
        double gallons;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);
        rangge1 = minivan.range();
        System.out.println(" Для преодоления " + dist +
                " миль мини-фургону требуется " +
                gallons + " галлон(ов) топлива ");
        System.out.println(" Mини-фypгoн может перевезти " +
                minivan.passengers + " пассажиров на расстояние " + rangge1 + " миль.");

        gallons = sportscar.fuelneeded(dist);
        rangge2 = sportscar.range();
        System.out.println(" Для преодоления " + dist +
                " миль спортивному автомобилю требуется " +
                gallons + " галлон(ов) топлива");
        System.out.println(" Cпopтивный автомобиль может перевезти " +
                sportscar.passengers + " пассажиров на расстояние " + rangge2 + " миль.");
    }
}
