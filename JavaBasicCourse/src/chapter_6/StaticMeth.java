/**
 * Applying the Static method
 *
 * @author Valentyn Mozul
 * @version 1.0 from 05.12.2022
 */

package chapter_6;

public class StaticMeth {
    static int val = 1024; // статическая переменная

    // Статический метод
    static int valDiv2() {
        return val / 2;
    }
}

class SDemo2 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        System.out.println("Знaчeниe val : " + StaticMeth.val);
        System.out.println("Знaчeниe StaticMeth.valDiv2 : " + StaticMeth.valDiv2());
        StaticMeth.val = 8;
        System.out.println("Знaчeниe val : " + StaticMeth.val);
        System.out.println("Знaчeниe StaticMeth.valDiv2 : " + StaticMeth.valDiv2());
    }
}
