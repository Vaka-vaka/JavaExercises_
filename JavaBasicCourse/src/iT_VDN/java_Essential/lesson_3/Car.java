/**
 * java basic
 * lesson 3
 *
 * @version 1.0 from 2023-09-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_3;

public class Car extends Vehicle {
    public String model;
    public int weight;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
