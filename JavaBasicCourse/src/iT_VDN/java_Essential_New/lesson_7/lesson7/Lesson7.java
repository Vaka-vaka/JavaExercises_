/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-12-25
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Lesson7 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Vova", 20);
        Person person2 = new Person("Nastya", 16);
        Person person3 = null;
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(new Person("Vova", 20));
        personList.add(new Person("Nastya", 17));
        try {
            checkAccess(personList);
            throwException();
        } catch (Exception e) {
            if (e instanceof IncorrectPersonDate) {
                IncorrectPersonDate incorrectPersonDate = (IncorrectPersonDate) e;
                System.out.println("IncorrectPersonDate " + incorrectPersonDate.getMessage());
            } else if (e instanceof NullObjectException) {
                NullObjectException nullObjectException = (NullObjectException) e;
                System.out.println("NullObjectException " + nullObjectException.getMessage());
            }
        } finally {
            System.out.println("checkAccess");
        }

//        List<Person> personListNull = new ArrayList<>();
//        personListNull.add(person3);
//        try {
//            checkAccess(personListNull);
//        } catch (IncorrectPersonDate | NullObjectException e) {
//            throw new RuntimeException(e);
//        }

//        personList = null;
//        try {
//            checkAccess(personList);
//        } catch (IncorrectPersonDate | NullObjectException e) {
//            throw new RuntimeException(e);
//        } finally {
//            System.out.println("checkAccess");
//        }

    }

    public static void throwException() throws Exception {
        throw new Exception();
    }

    public static void checkAccess(List<Person> personList) throws IncorrectPersonDate, NullObjectException {
        if (personList == null) {
            throw new IllegalArgumentException("Person list is null!!!");
        }

        if (!personList.isEmpty()) {
            for (Person person : personList) {
                checkIsAdult(person);
            }
        }
    }

    public static void checkIsAdult(Person person) throws IncorrectPersonDate, NullObjectException {
        try {
            if (person.getAge() > 18) {
                System.out.println(person.getName());
            } else {
                throw new IncorrectPersonDate("Error verify user age!");
            }
        } catch (NullPointerException exception) {
            throw new NullObjectException("Person doesnt exist", exception);
        }
    }
}
