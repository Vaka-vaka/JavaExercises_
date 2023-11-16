/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-10
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.bird;

public class Logic<T extends Bird> {
    T[] array; // масив із типом

    // конструктор, який ініціює масив
    Logic(T[] array) {
        this.array = array;
    }

    void display() {
        for (T temp : array) {
            temp.move();
            System.out.println(temp.weight);
        }
    }

    int weightController() {
        int sum = 0;
        for (T temp : array) {
            sum += temp.weight;
        }
        return sum;
    }

    static void weightCompare(Logic<?> c1, Logic<?> c2) {
        System.out.println(c1.weightController() - c2.weightController());
    }
}
