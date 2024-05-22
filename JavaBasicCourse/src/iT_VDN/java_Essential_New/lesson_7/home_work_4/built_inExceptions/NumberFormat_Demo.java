/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.home_work_4.built_inExceptions;

public class NumberFormat_Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("akka");

            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
}
