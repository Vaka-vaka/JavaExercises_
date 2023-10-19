/**
 * java basic
 * lesson 5
 *
 * @version 1.0 from 2023-10-01
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_5.homeWork_1;

import java.util.ArrayList;

public class Zoo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add(0, "Elephant");
        animals.add(1, "Giraffe");
        animals.add(2, "Lion");
        animals.add(3, "Wolf");
        animals.add(4, "Ostrich");
        animals.add(5, "Bear");
        animals.add(6, "Dolphin");
        animals.add(7, "Parrot");
        animals.add(8, "Mouse");
        animals.add(9, "Cat");

        for (String zoo : animals) {
            System.out.println(zoo);
        }
        System.out.println(animals.size());

        System.out.println();
        animals.remove(3);
        animals.remove(5);
        animals.remove(7);
        System.out.println(animals.size());
        for (String zoo : animals) {
            System.out.println(zoo);
        }
    }
}
