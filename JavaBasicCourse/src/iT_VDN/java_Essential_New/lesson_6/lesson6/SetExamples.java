/**
 * java basic
 * lesson 6
 *
 * @version 1.0 from 2023-12-18
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_6.lesson6;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {
    public void runSetExamples() {
        Set<Fruit> set = new HashSet<>();
        set.add(new Fruit("mango", 50, true));
        set.add(new Fruit("apple", 15, false));
        set.add(new Fruit("banana", 25, true));
        set.add(new Fruit("orange", 35, true));
        iterateUsingForEachLoop(set);
        removeFruit(set, new Fruit("apple", 15, false));
        iterateUsingForEachLoop(set);
    }

    public void iterateUsingForEachLoop(Set<Fruit> set) {
        for (Fruit fruit : set) {
            System.out.println(fruit.getName());
        }
    }

    public void removeFruit(Set<Fruit> set, Fruit fruit) {
        System.out.println("-----------------------");
        if (set.isEmpty()) {
            System.out.println("Set is Empty!");
        } else {
            System.out.println("Set size: " + set.size());
            if (set.contains(fruit)) {
                set.remove(fruit);
                System.out.println(fruit + " removed from set!");
            } else {
                System.out.println("Set does not have element:");
            }
        }
        System.out.println("_------------_");
    }
}
