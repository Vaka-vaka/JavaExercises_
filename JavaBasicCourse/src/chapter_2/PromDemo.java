/**
 * Unexpected result of type increase
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_2;

public class PromDemo {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        byte b;
        int i;
        b = 10;
        i = b * b;
        System.out.println(i);
        b = 10;
        b = (byte) ( b * b);
        System.out.println(b);
    }
}
