/**
 * java basic
 * lesson 4
 * homeWork_1
 *
 * @version 1.0 from 2023-09-27
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_4.homeWork_1;

public class MainAbstractHandler {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        AbstractHandler abstractHandler = new XMLHandler();
        abstractHandler.open();
        abstractHandler.change();
        abstractHandler.create();
        abstractHandler.save();

    }
}
