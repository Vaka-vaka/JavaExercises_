/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-09-04
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_2;

public class Auto2 {
    private int year;
    private double speed;
    private int weight;
    private String color;

    Auto2(int year) {
        this.year = year;
    }

    Auto2(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    Auto2(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    Auto2(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
