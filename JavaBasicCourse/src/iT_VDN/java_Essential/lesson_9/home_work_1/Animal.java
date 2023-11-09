/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2023-11-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_9.home_work_1;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    boolean tail;

    Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
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

    public String isTail() {
        if (tail) {
            return "yes";
        } else {
            return "no";
        }
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }

    @Override
    public String toString() {
        return "Name - " + getName() + ", " + "Age - " + getAge() + ", " + "Tail - " + isTail();
    }
}
