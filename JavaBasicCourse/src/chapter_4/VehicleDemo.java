/**
 * A program that uses the Vehicle class.
 * Assign the source code file the name VehicleDemo.java.
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_4;

class VehicleDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        //Присваивание значений полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Расчет дальности поездки с полным баком горючего
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Mини-фypгoн может перевезти " + minivan.passengers +
                " пассажиров на расстояние " + range + " миль");
    }
}

class Vehicle{
    int passengers; // количество пассажиров
    int fuelcap;   // емкость топливного бака
    int mpg;       // потребление топлива в милях на галлон
}
