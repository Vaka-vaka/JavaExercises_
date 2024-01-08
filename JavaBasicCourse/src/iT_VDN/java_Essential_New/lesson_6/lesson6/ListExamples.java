/**
 * java basic
 * lesson 6
 *
 * @version 1.0 from 2023-12-18
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_6.lesson6;

import java.util.*;

public class ListExamples {
    public void runListExamples() {
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("mango");
//        arrayList.add("apple");
//        arrayList.add("banana");
//        arrayList.add("orange");

        String[] array = {"mango", "banana", "orange"};
        List<String> arrayList = new LinkedList<>(
                Arrays.asList(array));

        String el0 = arrayList.get(0);
        String el1 = arrayList.get(1);
        removeFruit(arrayList, "banana");
        removeFruit(arrayList, "kiwi");
        removeFruit(new ArrayList<>(), "");
    }

    public void runListExample1() {
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("mango", 50, true));
        fruitList.add(new Fruit("apple", 15, false));
        fruitList.add(new Fruit("banana", 25, true));
        fruitList.add(new Fruit("orange", 35, true));
        iterateUsingForLoop(fruitList);
        System.out.println("-----------------");
        iterateUsingForEachLoop(fruitList);
        System.out.println("---------------");
        iterateUsingForLoop(fruitList);
        System.out.println("++");
        iterateUsingIterator(fruitList);
        System.out.println("++");
        iterateUsingForLoop(fruitList);
    }

    public void iterateUsingForLoop(List<Fruit> list) {
        for (int i = 0; i < list.size(); i++) {
            Fruit fruit = list.get(i);
            System.out.println("[" + i + "]" + fruit);
        }
    }

    public void iterateUsingForEachLoop(List<Fruit> list) {
        for (Fruit fruit : list) {
            if (fruit.getCost() > 30) {
                System.out.println(fruit);
            }
        }
    }

    public void iterateUsingIterator(List<Fruit> list) {
        Iterator<Fruit> iterator = list.iterator();
        while (iterator.hasNext()) {
            Fruit fruit = iterator.next();
            if (!fruit.isRipe()) {
                iterator.remove();
            }
        }
    }

    private void removeFruit(List<String> arrayList, String fruit) {
        System.out.println("----------------------------");
        if (arrayList.isEmpty()) {
            System.out.println("List is empty!");
        } else {
            int size = arrayList.size();
            System.out.println("List size " + size);
            if (arrayList.contains(fruit)) {
                System.out.println(arrayList);
                System.out.println("Element index: " + arrayList.indexOf(fruit));
                arrayList.remove(fruit);
                System.out.println(arrayList);
            } else {
                System.out.println("List does not have element: " + fruit);
            }
            System.out.println("----------------------------");
        }
    }
}
