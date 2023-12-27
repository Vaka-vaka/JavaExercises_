/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-11-22
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_2.home_work;

public class Product {
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double applyDiscount(double discount) {
        double disc = (getPrice() * discount) / 100;
        return getPrice() - disc;
    }
}
