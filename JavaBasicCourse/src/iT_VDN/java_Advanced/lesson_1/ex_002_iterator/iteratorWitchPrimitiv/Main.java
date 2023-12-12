/**
 * java advanced
 * lesson 1
 *
 * @version 1.0 from 2023-11-16
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_1.ex_002_iterator.iteratorWitchPrimitiv;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> arrayList = new ArrayList<>();

        arrayList.add(new Animal("Spaniel", 1200));
        arrayList.add(new Animal("Malamute", 4000));

        Iterator<Animal> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            animal.price += 1000;
        }
        System.out.println(arrayList);
    }
}
