/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-12-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_3.home_work2;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Soka" , 25);
        System.out.println(person.toString());

        Student student = new Student("Soka", 25, "IT");
        System.out.println(student.toString());

        Teacher teacher = new Teacher("D.N.", 45, "History");
        System.out.println(teacher.toString());
    }
}
