/**
 * java advanced
 * lesson 1
 *
 * @version 1.0 from 2023-11-20
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_1.ex_004_comparable.interface_comparable;

import java.util.Arrays;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 33, 25, 5000);
        Animal dog = new Animal("Labrador", 33, 25, 5000);
        Animal bird = new Animal("King Penguin", 33, 25, 5000);

        Animal[] c = {cat, dog, bird};

        Arrays.sort(c);   // ClassCastException w/o Comparable

        for (Animal tmp : c) {
            System.out.println(tmp);
        }
    }
}
