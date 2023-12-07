/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-12-06
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_3;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal("Max", 3);
        animal.makeSound();
        animal.eat();
        animal.sleep();
        System.out.println("==========================");

        Dog dog = new Dog("Buddy", 4, "big");
        dog.wagTail();
        dog.makeSound();
        dog.eat();
        dog.sleep();
        String dogSize = dog.getSize();
        System.out.println(dogSize);
        System.out.println("==========================");

        Cat cat = new Cat("Mark", 2, "white");
        cat.sleep();
        cat.purr();
        cat.makeSound();
        cat.eat();
        System.out.println(cat.getCoatColor());
        System.out.println("==========================");

        Pug pug = new Pug("Masya", 1);
        pug.eat();
        pug.sleep();
        pug.makeSound();
        String sizeP = pug.getSize();
        System.out.println(sizeP);
    }
}
