/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-10-12
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_7.home_work_1;

// Создаем перечислительный тип enum
public enum Vehicles {
    // Создаем список именованных констант
    BMW(5000, "Green"), AUDI(4500, "Blue");

    // Поля класа
    int price;
    String color;

    // Конструктор с параметрами
    Vehicles(int autoSuma, String color) {
        this.price = autoSuma;
        this.color = color;
    }

    // Создаем метод для возврата цвета машины
    public String getColor() {
        return color;
    }

    // Перегружаем метод toString()
    @Override
    public String toString() {
        return this.name() + ": price = " + price + "; color = " + this.getColor();
    }
}
