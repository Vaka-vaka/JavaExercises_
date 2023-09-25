/**
 * Adding a constructor
 *
 * @author Valentyn Mozul
 * @version 1.0 from 28.09.2022
 */

package java.Herbert_Shield.chapter_4;

public class Vehicles5 {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicles5(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

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

class  VehConsDemo{
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Vehicles5 minivan = new Vehicles5(7,16,21);
        Vehicles5 sportscar = new Vehicles5(2,14,12);
        int dist = 500;
        int rangge1, rangge2;
        double gallons;

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
