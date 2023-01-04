/**
 * Vehicle class extension for trucks
 *
 * @author Valentyn Mozul
 * @version 1.0 from 23.12.2022
 */

package chapter_7;

public class Vehicle {
    private int passengers; // количество пассажиров
    private int fuelcap; //объем топливного бака (в галлонах )
    private int mpg; // потребление топлива (в милях на галлон )

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Определение дальности поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    // Расчет количества топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    int getPassengers() {
        return passengers;
    }

    void setPassengers(int p) {
        passengers = p;
    }

    int getFuelcap() {
        return fuelcap;
    }

    void setFuelcap(int f) {
        fuelcap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }
}

class Truck extends Vehicle {
    private int cargocap; // грузоподъемность , выраженная в фунтах

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    // Методы доступа к переменной cargocap
    int getCargocap() {
        return cargocap;
    }

    void putCargocap(int c) {
        cargocap = c;
    }
}

//Создание класса, описывающего внедорожники
class OffRoad extends Vehicle {
    int groundClearance;

    OffRoad(int p, int f, int m, int g) {
        super(p, f, m);

        groundClearance = g;
    }

    // Методы доступа к переменной cargocap
    int getGroundClearance() {
        return groundClearance;
    }

    void putGroundClearance(int g) {
        groundClearance = g;
    }
}

class VehConsDemo2 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        int dist = 500;
        int rangge1, rangge2;
        double gallons;

        gallons = minivan.fuelneeded(dist);
        rangge1 = minivan.range();
        System.out.println(" Для преодоления " + dist +
                " миль мини-фургону требуется " +
                gallons + " галлон(ов) топлива");
        System.out.println(" Mини-фypгoн может перевезти " +
                minivan.getPassengers() + " пассажиров на расстояние " + rangge1 + " миль.\n");

        gallons = sportscar.fuelneeded(dist);
        rangge2 = sportscar.range();
        System.out.println(" Для преодоления " + dist +
                " миль спортивному автомобилю требуется " +
                gallons + " галлон(ов) топлива");
        System.out.println(" Cпopтивный автомобиль может перевезти " +
                sportscar.getPassengers() + " пассажиров на расстояние " + rangge2 + " миль.\n");

        // Создание ряда новых объектов типа Truck
        Truck semi = new Truck(2, 200, 7, 4400);
        Truck pickup = new Truck(3, 28, 15, 2000);

        gallons = semi.fuelneeded(dist);
        System.out.println();
        System.out.println("Гpyзoвик может перевезти " + semi.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль грузовику требуется " +
                gallons + " галлонов топлива.\n");

        gallons = pickup.fuelneeded(dist);
        System.out.println("Пикaп может перевезти " + pickup.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль грузовику требуется " +
                gallons + " галлонов топлива.\n");

        // Создание ряда новых объектов типа OffRoad
        OffRoad suv = new OffRoad(5, 50, 10, 35);
        OffRoad crossover = new OffRoad(5, 43, 7, 30);

        gallons = suv.fuelneeded(dist);
        System.out.println("У внедорожника дорожный просвет " + suv.getGroundClearance() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль внедорожнику требуется " +
                gallons + " галлонов топлива.\n");

        gallons = crossover.fuelneeded(dist);
        System.out.println("У кроссовера дорожный просвет " + crossover.getGroundClearance() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль внедорожнику требуется " +
                gallons + " галлонов топлива.\n");
    }
}
