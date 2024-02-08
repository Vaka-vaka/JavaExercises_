/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2024-02-06
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.home_work_3;

public class MainPerson {

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Person person = new Person("John");
        person = null;
        //person.setName("Naga");
        //person.introduce();
        try {
            person.introducePerson(person);
        } catch (NullPointerException e) {
            System.out.println("Null object encountered!");
        }
    }
}
