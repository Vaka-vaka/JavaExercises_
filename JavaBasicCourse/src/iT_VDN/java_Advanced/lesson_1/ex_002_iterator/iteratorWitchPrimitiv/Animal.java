/**
 * java advanced
 * lesson 1
 *
 * @version 1.0 from 2023-11-16
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_1.ex_002_iterator.iteratorWitchPrimitiv;

public class Animal {
    String breed;
    int price;

    public Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return breed + " = " + price;
    }
}
