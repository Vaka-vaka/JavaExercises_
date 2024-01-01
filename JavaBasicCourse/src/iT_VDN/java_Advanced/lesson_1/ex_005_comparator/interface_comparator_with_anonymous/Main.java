/**
 * java advanced
 * lesson 1
 *
 * @version 1.0 from 2023-11-20
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_1.ex_005_comparator.interface_comparator_with_anonymous;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 20, 4000);
        Animal bird = new Animal("King Penguin", 15, 8, 50000);

        Animal[] c = {cat, dog, bird};

        Arrays.sort(c, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.price - o2.price;
            }
        });
        for (Animal tmp : c) {
            System.out.println("Price = " + tmp);
        }
        System.out.println();
        Arrays.sort(c, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.speed - o2.speed;
            }
        });
        for (Animal tmp : c) {
            System.out.println("Speed = " + tmp);
        }
        System.out.println();
        Arrays.sort(c, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.weight - o2.weight;
            }
        });
        for (Animal tmp : c) {
            System.out.println("Weight = " + tmp);
        }
        System.out.println();
        Arrays.sort(c, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.breed.compareTo(o2.breed);
            }
        });
        for (Animal tmp : c) {
            System.out.println("Breed compareTo = " + tmp);
        }
    }
}
