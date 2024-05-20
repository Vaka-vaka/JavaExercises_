/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.home_work_4.built_inExceptions;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class NoSuchMethod_Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Set exampleleSet = new HashSet();

        Hashtable exampleTable = new Hashtable();

        exampleleSet.iterator().next();

        exampleTable.elements().nextElement();
    }
}
