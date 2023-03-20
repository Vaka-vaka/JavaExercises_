/**
 * lastDigit
 *
 * @author Valentyn Mozul
 * @version 1.0 from 29.12.2022
 */

/*
lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
*/

package codingBat.warmup_1;

public class LastDigit {
    boolean lastDigit(int a, int b) {
//        int a1 = (a % 10);
//        int b1 = (b % 10);
//        System.out.println(a1 + " " + b1);
        return (a%10 == b%10);
    }
}

class LastDigitDemo {
    public static void main(String[] args) {
        LastDigit lastDigit = new LastDigit();
        System.out.println(lastDigit.lastDigit(7, 17));
        System.out.println(lastDigit.lastDigit(6, 17));
        System.out.println(lastDigit.lastDigit(3, 113));
    }
}