/**
 * java basic
 * lesson 6
 *
 * @version 1.0 from 2023-12-20
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_6.home_work_2;

import java.util.LinkedList;
import java.util.List;

public class GreatLinkedList {
    List<String> stringList = new LinkedList<>();
    String[] strings = {"banana", "orange", "mango", "kiwi", "apple"};

    public void stringsLinkedList() {
        for (int i = 0; i < strings.length; i++) {
            stringList.add(i, strings[i]);
        }
        System.out.println(stringList);

        String s = stringList.get(0);
        System.out.println("get 0 = " + s);

        int size = stringList.size();
        System.out.println("size = " + size);

        String remove = stringList.remove(0);
        System.out.println("remove index 0");

        System.out.println(stringList);
    }

    public void getStringsLinkedList() {
        for (int i = 0; i < stringList.size(); i++) {
            String s = stringList.get(i);
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("____-----____----____-----___");

        for (int i = 0; i < stringList.size(); i++) {
            String s1 = stringList.get((stringList.size() - 1) - i);
            System.out.print(s1 + " ");
        }
        System.out.println();
    }
}
