/**
 * java basic
 * lesson 6
 *
 * @version 1.0 from 2023-12-20
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_6.home_work_2;

import java.util.ArrayList;

public class GreatArrayList {
    ArrayList<Integer> arrayList = new ArrayList<>();
    Integer[] number = {100, 300, 343, 222, 444, 876, 111};

    public void addNumber() {
        for (int i = 0; i < number.length; i++) {
            arrayList.add(i, number[i]);
        }
        System.out.println("arrayList = " + arrayList);

        int size = arrayList.size();
        System.out.println("size = " + size);

        Integer integer1 = arrayList.get(5);
        System.out.println("get 5 index = " + integer1);

        Integer remove = arrayList.remove(5);
        System.out.println("remove 5 index " + remove);

        System.out.println("arrayList = " + arrayList);

        boolean contains = arrayList.contains(100);
        System.out.println("contains = " + contains);

        int i = arrayList.indexOf(111);
        System.out.println("number 111 = " + i + " index");

        int i1 = arrayList.lastIndexOf(222);
        System.out.println("number 222 = " + i1 + " index");

    }
}
