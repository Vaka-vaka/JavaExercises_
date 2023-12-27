/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2023-10-23
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_8.home_work_3;

public class Price {
    // Поля клаcса Price
    String nameProduct;
    String nameStore;
    double value;

    // Конструктор с параметрами
    Price(String name, String nameStore, double value) {
        this.nameProduct = name;
        this.value = value;
        this.nameStore = nameStore;
    }

    // Перегрузка метода toString()
    @Override
    public String toString() {
        return "Name Product = " + this.nameProduct + " " +
                "Name Store = " + this.nameStore + " " +
                "Value = " + this.value;
    }
}
