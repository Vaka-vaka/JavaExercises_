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
    public static void main(String[] args) throws ZeroDivisionException {
        Person person = new Person("John");
        person = null;
        try {
            person.introducePerson(person);
        } catch (NullPointerException e) {
            System.out.println("Null object encountered!");
        }

        Person person1 = new Person();
        try {
            System.out.println(person1.divideNumbers(25, 0));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

        DateProcessor processor = new DateProcessor();

        try {
            processor.processData(9);
            processor.processData(-3);
            processor.processData(0);
        } catch (Exception e) {
            if (e instanceof NegativeNumberException) {
                NegativeNumberException negativeNumberException = (NegativeNumberException) e;
                System.out.println("NegativeNumberException " + negativeNumberException.getMessage());
            } else if (e instanceof ZeroDivisionException) {
                ZeroDivisionException zeroDivisionException = (ZeroDivisionException) e;
                System.out.println("ZeroDivisionException " + zeroDivisionException.getMessage());
            }
        }
    }
}
