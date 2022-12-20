/**
 * TestWork
 *
 * @author Valentyn Mozul
 * @version 1.0 from 11.12.2022
 */

/*Учитывая строку, вернуть true, если строка начинается с «привет», и false в противном случае.

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false*/

package CodingBat.warmup_1;

public class StartHi {
    public boolean startHi(String str){
        if(str.length() < 2){
            return false;
        }

        return str.substring(0, 2).equals("hi");
    }
}

class StartHiDemo{
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        StartHi hi = new StartHi();

        System.out.println(hi.startHi("hi there"));
        System.out.println(hi.startHi("hi"));
        System.out.println(hi.startHi("hello hi"));
        System.out.println(hi.startHi("h"));
        System.out.println(hi.startHi(""));
    }
}
