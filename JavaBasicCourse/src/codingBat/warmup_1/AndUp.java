/**
 * andUp
 *
 * @author Valentyn Mozul
 * @version 1.0 from 29.12.2022
 */

/*
endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
*/

package codingBat.warmup_1;

public class AndUp {
    String andUp(String str) {
        if (str.length() < 3) return str.toUpperCase();
        int cut = str.length() - 3; //віднімає 3 знака з кінця
        String start = str.substring(0, cut);
        String end = str.substring(cut);
        return (start + end.toUpperCase());
    }
}

class AndUpDemo {
    public static void main(String[] args) {
        AndUp andUp = new AndUp();
        System.out.println(andUp.andUp("Hello"));
        System.out.println(andUp.andUp("hi there"));
        System.out.println(andUp.andUp("hi"));
    }
}
