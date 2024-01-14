/**
 * java basic
 * lesson 6
 *
 * @version 1.0 from 2023-12-21
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_6.home_work_2;

import java.util.HashSet;
import java.util.Set;

public class GreatHashSet {
    Set<String> set = new HashSet<>();

    public void addColor(String color) {
        set.add(color);
    }

    public void printSet() {
        System.out.println(set.toString());
    }
}
