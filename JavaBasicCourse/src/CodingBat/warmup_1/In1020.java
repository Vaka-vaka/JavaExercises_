/**
 * Given 2 int values, return true if either
 * of them is in the range 10..20 inclusive.
 *
 * @author Valentyn Mozul
 * @version 1.0 from 11.12.2022
 */

/*
in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
*/

package CodingBat.warmup_1;

public class In1020 {
    public boolean in1020(int a, int b){
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }
}

class In1020Demo{
    public static void main(String[] args) {
        In1020 in1020 = new In1020();

        System.out.println(in1020.in1020(4, 12));
        System.out.println(in1020.in1020(8, 99));
    }
}
