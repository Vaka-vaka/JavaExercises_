/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-10
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.bird;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Strauss[] s = {new Strauss(55), new Strauss(60)};
        Penguin[] p = {new Penguin(15), new Penguin(18), new Penguin(20)};
        Logic<Strauss> l = new Logic<>(s);
        l.display();
        Logic<Penguin> pg = new Logic<>(p);
        pg.display();
        System.out.println("SUMA");
        Logic.weightCompare(l, pg);
    }
}
