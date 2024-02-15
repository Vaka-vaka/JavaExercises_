/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2024-02-06
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.home_work_3;

public class Person {
    private String name;

    Person() {
    }

    Person(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hello!" + " " + getName() + " " + "How are you?");
    }

    public void introducePerson(Person person) {
        person.introduce();
    }

    public int divideNumbers(int a, int b) {
        return a / b;
    }
}
