/**
 * java advanced
 * Home work 1
 *
 * @version 1.0 from 2023-11-20
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_1.home_works;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class H_W {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("________----------------------________");

        Collections.reverse(list);


        for (Integer temp : list) {
            System.out.print(temp + " ");
        }
    }
}
