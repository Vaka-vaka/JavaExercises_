/**
 * java basic
 * lesson 3
 *
 * @version 1.0 from 2023-09-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_3;

public class Ship extends Vehicle {
    public int numberPassengersShip;
    public String portResidence;

    public int getNumberPassengersShip() {
        return numberPassengersShip;
    }

    public void setNumberPassengersShip(int numberPassengersShip) {
        this.numberPassengersShip = numberPassengersShip;
    }

    public String getPortResidence() {
        return portResidence;
    }

    public void setPortResidence(String portResidence) {
        this.portResidence = portResidence;
    }
}
