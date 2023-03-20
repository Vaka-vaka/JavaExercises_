/**
 * Given 2 int values, return true if they are both in the range 30..40 inclusive,
 * or they are both in the range 40..50 inclusive
 *
 * @author Valentyn Mozul
 * @version 1.0 from 14.12.2022
 */

/*
in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
*/

package codingBat.warmup_1;

public class In3050 {
    public boolean in3050(int a, int b) {
        return (a >= 30 && a <= 40) && (b >= 30 && b <= 40) ||
                (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
    }
}

class In3050Demo {
    public static void main(String[] args) {
        In3050 in3050 = new In3050();

        System.out.println(in3050.in3050(30, 31));
        System.out.println(in3050.in3050(30, 41));
        System.out.println(in3050.in3050(40, 50));
    }
}
