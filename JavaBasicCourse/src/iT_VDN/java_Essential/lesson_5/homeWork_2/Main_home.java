/**
 * java basic
 * lesson 5
 *
 * @version 1.0 from 2023-10-01
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_5.homeWork_2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main_home {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        ListIterator<Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            arrayList.set(listIterator.nextIndex(), listIterator.nextIndex() + 2);
            Integer integer = listIterator.next();
            System.out.println(integer);
        }
    }
}
