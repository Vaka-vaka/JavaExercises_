/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-12-25
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.lesson7;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
