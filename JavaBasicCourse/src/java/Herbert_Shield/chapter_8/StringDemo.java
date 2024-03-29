/**
 * Test new String()
 *
 * @author Valentyn Mozul
 * @version 1.0 from 28.02.2023
 */

package java.Herbert_Shield.chapter_8;
public class StringDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int[] asc = {65, 66, 67, 68};
        String s;
        s = new String(asc, 0, 1);
        System.out.println(s);
        s = new String(asc, 0, 2);
        System.out.println(s);
        s = new String(asc, 0, 3);
        System.out.println(s);
        s = new String(asc, 0, 4);
        System.out.println(s);
        s = new String(asc, 3, 1);
        System.out.println(s);
        s = new String(asc, 2, 2);
        System.out.println(s);
        s = new String(asc, 1, 3);
        System.out.println(s);
        s = new String(asc, 0, 4);
        System.out.println(s);
        System.out.println();

        int[] arrayLang = {1, 2, 3, 4, 5};
        for (int i = 0; i < arrayLang.length - 2; ++i) {
            System.out.print(arrayLang[i] + " ");
        }
    }
}
