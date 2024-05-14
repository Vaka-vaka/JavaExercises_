/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.home_work_4.built_inExceptions;

public class ClassNotFound_Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("Class1");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            System.out.println("Class Not Found...");
        }
    }
}
