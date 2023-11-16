/**
 * java basic
 * lesson 5
 *
 * @version 1.0 from 2023-09-30
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_5;

import java.util.ArrayList;

public class Main_ {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> teacher = new ArrayList<>();
        teacher.add("Mozul V.");
        teacher.add("Drobot G.");
        teacher.add("Victor G.");
        teacher.add("Galyna D.");
        teacher.add("Ivan M.");
        teacher.add("Barabach V.M.");
        teacher.add("Olecsiy I.");
        teacher.add("Yonovych");
        teacher.add("Tamara Ivanivna");
        teacher.add("Petro V.");

        for (String temp : teacher) {
            System.out.println(temp);
        }
        System.out.println("Index bestTeacher - " + teacher.indexOf("Mozul V."));
        System.out.println("Index worstTeacher - " + teacher.indexOf("Petro V."));
    }
}
