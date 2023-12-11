/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-12-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_3.home_work2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = " + name + " " + "age = " + age;
    }
}
