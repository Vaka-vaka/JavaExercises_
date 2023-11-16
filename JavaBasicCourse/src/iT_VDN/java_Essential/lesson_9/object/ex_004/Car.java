/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2023-10-31
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_9.object.ex_004;

public class Car {
    private int id;

    public Car(int id) {
        this.id = id;
    }

    // перезаписываем метод equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //рефлетивность x.equals(x)
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj; //приводим к типу Car
        if (id != car.id) return false;
        return true;
    }
}
