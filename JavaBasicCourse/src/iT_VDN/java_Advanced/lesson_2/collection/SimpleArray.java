/**
 * java advanced
 * lesson 2
 *
 * @version 1.0 from 2023-11-27
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_2.collection;

import java.util.ArrayList;

public class SimpleArray {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
//        list.add(10);
//        list.add(0, 20);
//        list.add(30);
//        list.add(1, 40);
//
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }


        for (int i = 0; i < 101; i++) {
            list.add(i);
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n" + list.size());
        for (int i = 0; i < 50; i++) {
            list.remove(0);
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n" + list.size());
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }


//        ArrayList arrayList = new ArrayList();
//
//        arrayList.add(10);
//        arrayList.add("Gotton");
//
//        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
//        arrayList1.add((Integer) (arrayList.get(0)));
//        // arrayList1.add((Integer) (arrayList.get(1)));
//        System.out.println(arrayList1.get(0));
//        // System.out.println(arrayList1.get(1));
//        System.out.println(arrayList.get(0) + " " + arrayList.get(1));
//
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Trip");
//        arrayList2.add((String) (arrayList.get(1)));
//        System.out.println(arrayList2.get(0) + " " + arrayList2.get(1));
    }
}
