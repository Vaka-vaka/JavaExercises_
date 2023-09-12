/**
 * Test demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 08.03.2023
 */

package java.Herbert_Shield.chapter_7;

public interface Ivehicle {
    // Определение дальности поездки транспортного средства
    int range();

    // Расчет количества топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    double fuelneeded(int miles);

    int getPassengers();

    void setPassengers(int p);

    int getFuelcap();

    void setFuelcap(int f);

    int getMpg();

    void setMpg(int m);
}
