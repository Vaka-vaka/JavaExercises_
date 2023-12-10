/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-12-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_3.home_work1;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal("Dog", 1);
        animal.makeSound();

        Dog dog  = new Dog("Masay", 1, "Spaniel");
        dog.makeSound();

        Cat cat = new Cat("Petro", 2, "black");
        cat.makeSound();
    }
}
