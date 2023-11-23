/**
 * java basic
 * lesson 1
 *
 * @version 1.0 from 2023-11-22
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_1;

public class Car {
    private String model;

    public Car() {

    }

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void showModel() {
        System.out.println(getModel());
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Car car = new Car("Audi");
        car.showModel();
    }
}
