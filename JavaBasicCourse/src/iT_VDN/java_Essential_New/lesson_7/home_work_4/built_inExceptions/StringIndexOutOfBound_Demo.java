/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.home_work_4.built_inExceptions;

public class StringIndexOutOfBound_Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        try {
            String a = "This is like chipping "; //length is 22
            char c = a.charAt(24); //accessing 25th element
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
