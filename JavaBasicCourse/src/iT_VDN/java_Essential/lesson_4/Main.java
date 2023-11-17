/**
 * java basic
 * lesson 4
 *
 * @version 1.0 from 2023-09-26
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_4;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Bird p = new Penguin();
        Bird s = new Straus();
        Bird sw = new Swallow();

        p.move();
        s.move();
        sw.move();
    }
}
