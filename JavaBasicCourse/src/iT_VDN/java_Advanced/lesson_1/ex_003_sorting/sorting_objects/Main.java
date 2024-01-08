/**
 * java advanced
 * lesson 1
 *
 * @version 1.0 from 2023-11-20
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_1.ex_003_sorting.sorting_objects;

import java.util.Arrays;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 20, 4000);
        Animal bird = new Animal("King Penquin", 15, 8, 50000);

        Animal[] c = {cat, dog, bird};

        Arrays.sort(c);
    }
}
