/**
 * Return true if the given string begins with "mix",
 * except the 'm' can be anything, so "pix", "9ix" .. all count
 *
 * @author Valentyn Mozul
 * @version 1.0 from 13.12.2022
 */

/*
mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
*/

package CodingBat.warmup_1;

public class MixStart {
    public boolean mixStart(String str) {
        return (str.length() >= 3 && str.substring(1, 3).equals("ix"));
    }
}

class MixStartDemo {
    public static void main(String[] args) {
        MixStart mixStart = new MixStart();

        System.out.println(mixStart.mixStart("mix snacks"));
        System.out.println(mixStart.mixStart("pix snacks"));
        System.out.println(mixStart.mixStart("piz snacks"));
    }
}
