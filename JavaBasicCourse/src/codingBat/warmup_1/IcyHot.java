/**
 * Given two temperatures, return true if
 * one is less than 0 and the other is greater than 100
 *
 * @author Valentyn Mozul
 * @version 1.0 from 11.12.2022
 */

/*
icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
*/

package codingBat.warmup_1;

public class IcyHot {
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }
}

class IcyHotDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        IcyHot icyHot = new IcyHot();

        System.out.println(icyHot.icyHot(120, -1));
        System.out.println(icyHot.icyHot(-1, 120));
        System.out.println(icyHot.icyHot(2, 120));
    }
}
