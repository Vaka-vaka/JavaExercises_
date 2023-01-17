/**
 * max1020
 *
 * @author Valentyn Mozul
 * @version 1.0 from 28.12.2022
 */

/*
max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
*/

package CodingBat.warmup_1;

public class Max1020 {
    int max1020(int a, int b) {
//        if (a > b) {
//            int temp = b; //11
//            b = a;
//            a = temp;
//        }
//
//        if (b >= 10 && b <= 20) return b;
//        if (a >= 10 && a <= 20) return a;
//        return 0;

        if(a > b && a >= 10 && a <= 20) return a;
        if(b > a && b >= 10 && b <= 20) return b;
        if(a < b && a >= 10 && a <= 20)return a;
        if(b < a && b >= 10 && b <= 20) return b;
        return 0;
    }
}

class Max1020Demo {
    public static void main(String[] args) {
        Max1020 max1020 = new Max1020();

        System.out.println(max1020.max1020(19, 11));
        System.out.println(max1020.max1020(9, 21));
        System.out.println(max1020.max1020(11, 19));
        System.out.println(max1020.max1020(10, 21));
        System.out.println(max1020.max1020(21, 11));
        System.out.println(max1020.max1020(21, 23));
        System.out.println(max1020.max1020(25, 22));
    }
}