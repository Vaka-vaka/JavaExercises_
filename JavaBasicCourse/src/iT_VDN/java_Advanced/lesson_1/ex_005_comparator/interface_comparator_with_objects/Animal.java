/**
 * java advanced
 * lesson 1
 *
 * @version 1.0 from 2023-11-20
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_1.ex_005_comparator.interface_comparator_with_objects;

import java.util.Comparator;

public class Animal {
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

    @Override
    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }
}

class ComparatorByPrice implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Animal) o1).price - ((Animal) o2).price;
    }
}

class ComparatorBySpeed implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Animal) o1).speed - ((Animal) o2).speed;
    }
}

class ComparatorByBreed implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Animal) o1).breed.compareTo(((Animal) o2).breed);
    }
}
