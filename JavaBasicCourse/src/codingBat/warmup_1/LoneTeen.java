/**
 * We'll say that a number is "teen" if it is in the range 13..19
 * inclusive. Given 2 int values, return true if one or the other is teen, but not both.
 *
 * @author Valentyn Mozul
 * @version 1.0 from 12.12.2022
 */

/*
loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
*/

package codingBat.warmup_1;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        boolean aa = (a >= 13 && a <= 19);
        boolean bb = (b >= 13 && b <= 19);

        return (aa && !bb) || (bb && !aa);
    }
}

class LoneTeenDemo {
    public static void main(String[] args) {
        LoneTeen loneTeen = new LoneTeen();

        System.out.println(loneTeen.loneTeen(13, 99));
        System.out.println(loneTeen.loneTeen(13, 13));
    }
}