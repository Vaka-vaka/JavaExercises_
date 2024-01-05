/**
 * internet store
 *
 * @version 1.0 from 2024-01-02
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.internetStore;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
