/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.generic;

import java.util.ArrayList;
import java.util.List;

// сирий тип
public class Main_l {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        List l = new ArrayList(); // сирий тип
        List<String> list = new ArrayList<>(); // дженерік String

        l = list;
        l.add("Hello");

        String s = list.get(0);
        System.out.println(s);
    }
}
