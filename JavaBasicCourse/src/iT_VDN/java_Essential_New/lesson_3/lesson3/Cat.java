/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-12-06
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_3.lesson3;

public class Cat extends Animal {
    private String coatColor;

    public Cat(String name, int age, String coatColor) {
        super(name, age);
        this.coatColor = coatColor;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void purr() {
        System.out.println("The cat is purring!");
    }
}
