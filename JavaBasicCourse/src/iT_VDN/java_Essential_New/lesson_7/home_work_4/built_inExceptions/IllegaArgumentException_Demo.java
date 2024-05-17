/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.home_work_4.built_inExceptions;

import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.exception.IllegalArgumentException;

public class IllegaArgumentException_Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IllegalArgumentException {
        print(18);
    }

    public static void print(int a) throws IllegalArgumentException {
        if (a >= 18) {
            System.out.println("Eligible for Voting");
        } else {
            throw new IllegalArgumentException("Not Eligible for Voting");
        }
    }
}
