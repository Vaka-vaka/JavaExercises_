/**
 * We'll say that a number is "teen" if
 * it is in the range 13..19 inclusive.
 * Given 3 int values, return true if 1 or more of them are teen
 *
 * @author Valentyn Mozul
 * @version 1.0 from 11.12.2022
 */

/*
hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
*/

package CodingBat.warmup_1;

public class HasTen {
    public boolean hasTen(int a, int b, int c) {
        return (a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19);
    }
}

class HasTenDemo {
    public static void main(String[] args) {
        HasTen hasTen = new HasTen();

        System.out.println(hasTen.hasTen(13, 20, 10));
        System.out.println(hasTen.hasTen(44, 22, 55));
    }
}
