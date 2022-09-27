/**
 * Adding a range method() to the Vehicle class
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_4;

class Vehicles {

        int passengers;  // количество пассажиров
        int fuelcap;     // емкость топливного бака
        int mpq1;         // потребление топлива в милях на галлон

        // Отображение даль ности пое здки транспортного средства
        void range(){
            System.out.println(" Дaльнocть - " + fuelcap * mpq1 + " миль.");
    }
}

class AddMatch{
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Vehicles minivan = new Vehicles();
        Vehicles sportscar = new Vehicles();

        int range1, range2;

        // Присваивание значений полям объекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpq1 = 21;

        // Присваивание значений полям объекта sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpq1 = 12;

        System.out.println("Mини- фypгoн может перевезти " + minivan.passengers + " пассажиров. ");
        minivan.range();

        System.out.println("Cпopтивный автомобиль может перевезти " + sportscar.passengers + " пассажиров . ");
        sportscar.range();
    }
}
