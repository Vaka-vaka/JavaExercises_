/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-10-16
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_7.home_work_2;

public enum Animals {
    DOG(3, "Charle"), CAT(5, "Sonay");
    int age;
    String name;

    Animals(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name() + ": age = " + age + ", name = " + name;
    }
}
