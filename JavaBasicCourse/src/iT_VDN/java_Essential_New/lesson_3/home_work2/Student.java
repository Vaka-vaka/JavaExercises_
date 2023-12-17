/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-12-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_3.home_work2;

public class Student extends Person {

    private String specialty;

    public Student(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return super.toString() + " specialty = " + specialty;
    }
}
