/**
 * Given 2 int values, return whichever value is nearest
 * to the value 10, or return 0 in the event of a tie.
 * Note that Math.abs(n) returns the absolute value of a number.
 *
 * @author Valentyn Mozul
 * @version 1.0 from 14.12.2022
 */

/*
close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
*/

package codingBat.warmup_1;

public class Close10 {
    public int close10(int a, int b) {
        int aa = Math.abs(a - 10);
        int bb = Math.abs(b - 10);

//        int a1 = Math.abs(aa);
//        int b1 = Math.abs(bb);

        if (aa == bb) return 0;

        /*
        if(a1 < b1){
        return a;
        }else{
        return b;
        }
        */

        return Math.min(a, b);
    }
}

class Close10Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Close10 close10 = new Close10();

        System.out.println(close10.close10(8, 13));
        System.out.println(close10.close10(13, 8));
        System.out.println(close10.close10(13, 7));
    }
}
