/**
 * Demonstration of using the % operator
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_2;

public class ModDerno {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int iresult, irem;
        double dresult, drem;
        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("Peзyльтaт и остаток от деления 10 / 3: " + iresult + " " + irem);
        System.out.println("Peзyльтaт и остаток от деления 10.0 / 3.0: " + dresult + " " + drem);

        int x = 10;
        int y = ++x;
        System.out.println(y);
        int x1 = 10;
        int y1 = x1++;
        int a = x1;
        System.out.println(y1 + " " + a);
    }
}
