/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-12-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_3.home_work1;

public class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void meow() {
        System.out.println("Meow meow");
    }

    @Override
    public void makeSound() {
        System.out.print(getName() + ": ");
        meow();
    }
}
