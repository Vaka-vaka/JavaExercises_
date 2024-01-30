/**
 * java advanced
 * lesson 1
 *
 * @version 1.0 from 2023-11-20
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_1.ex_004_comparable.interface_comparable;

public class Animal implements Comparable {
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {              //    public int compareTo(Animal o) {
        int tmp1 = this.speed - ((Animal) o).speed; //    int tmp = this.speed - o.speed;
        int tmp2 = this.price - ((Animal) o).price;
        int tmp3 = this.weight - ((Animal) o).weight;

        if (tmp1 == 0 && tmp2 == 0 && tmp3 == 0) {
            return this.breed.compareTo(((Animal) o).breed);
        } else if (tmp1 == 0 && tmp2 == 0) {
            return tmp3;
        } else if (tmp1 == 0) {
            return tmp2;
        } else {
            return tmp1;
        }
    }

    // Сравнение 2-х строковых значений
    // return this.breed.compareTo(((Animal)o).breed);
}
