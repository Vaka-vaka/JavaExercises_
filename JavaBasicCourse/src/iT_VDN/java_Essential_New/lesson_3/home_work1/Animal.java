/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-12-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_3.home_work1;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Animal is making a sound!");
    }
}
