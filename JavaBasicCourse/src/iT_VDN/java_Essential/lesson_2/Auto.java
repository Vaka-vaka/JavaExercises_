/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-09-04
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_2;

public class Auto {
    private int year;
    private String color;

    Auto() {
    }

    Auto(int year) {
        this.year = year;
    }

    Auto(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
