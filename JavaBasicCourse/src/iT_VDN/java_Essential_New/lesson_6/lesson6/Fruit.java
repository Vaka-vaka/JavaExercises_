/**
 * java basic
 * lesson 6
 *
 * @version 1.0 from 2023-12-18
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_6.lesson6;

import java.util.Objects;

public class Fruit {
    private String name;
    private int cost;
    private boolean isRipe;

    public Fruit(String name, int cost, boolean isRipe) {
        this.name = name;
        this.cost = cost;
        this.isRipe = isRipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isRipe() {
        return isRipe;
    }

    public void setRipe(boolean ripe) {
        isRipe = ripe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return cost == fruit.cost && isRipe == fruit.isRipe && name.equals(fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, isRipe);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", isRipe=" + isRipe +
                '}';
    }
}
