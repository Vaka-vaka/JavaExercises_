/**
 * Using the return value
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_4;

public class TreVehicles {
        int passengers;
        int fuelcap;
        int mpg;

        // Возврат дальности поездки
        int range(){
            return fuelcap * mpg;
        }
}

class RatMeth{
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        TreVehicles minivan = new TreVehicles();
        TreVehicles sportscar = new TreVehicles();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("Mини-фypгoн может перевезти " +
                minivan.passengers + " пассажиров на расстояние " + range1 + " миль.");
        System.out.println("Cпopтивный автомобиль может перевезти " +
                sportscar.passengers + " пассажиров на расстояние " + range2 + " миль.");
    }
}
