/**
 * java basic
 * lesson 6
 *
 * @version 1.0 from 2023-10-09
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_6.homeWork_Oracle;

public class IdentiFyMyParts {
    public static int x = 7;
    public int y = 3;

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        IdentiFyMyParts a = new IdentiFyMyParts();
        IdentiFyMyParts b = new IdentiFyMyParts();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyMyParts.x = " + IdentiFyMyParts.x);
    }
}
