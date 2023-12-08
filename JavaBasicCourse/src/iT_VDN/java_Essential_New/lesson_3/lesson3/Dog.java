/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-12-06
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_3.lesson3;

public class Dog extends Animal {

    private String size;

    public Dog(String name, int age, String size) {
        super(name, age);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void wagTail() {
        System.out.println("Wagging its tail!");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " is barking! Woof woof!");
    }
}
