/**
 * java basic
 * lesson 1
 *
 * @author Valentyn Mozul
 * @version 1.0 from 30.08.2023
 */

package iT_VDN.java_Essential.lesson_1;

public class A2 {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        A2 a2 = new A2();
        a2.setX(5);
        System.out.println(a2.getX());
    }
}
