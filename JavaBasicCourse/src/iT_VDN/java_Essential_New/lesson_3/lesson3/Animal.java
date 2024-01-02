/**
 * java basic
 * lesson 3
 *
 * @version 1.0 from 2023-12-06
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_3.lesson3;

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

    public void eat() {
        System.out.println(name + " is eating!");
    }

    public void sleep() {
        System.out.println(name + " is sleeping!");
    }

    public void makeSound() {
        System.out.println("Animal is making a sound!");
    }

    @Override
    public String toString() {
        return "Animal[name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Animal animal = (Animal) obj;
        return this.name.equals(animal.name) && this.age == animal.age;
    }
}
