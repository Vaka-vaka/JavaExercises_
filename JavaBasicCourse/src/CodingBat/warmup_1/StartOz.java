/**
 * Given a string, return a string made of the first 2 chars (if present),
 * however include first char only if it is 'o' and include the second
 * only if it is 'z', so "ozymandias" yields "oz".
 *
 * @author Valentyn Mozul
 * @version 1.0 from 13.12.2022
 */

/*
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
*/

package CodingBat.warmup_1;

public class StartOz {
    public String startOz(String str) {
        boolean o = (str.length() >= 1 && str.charAt(0) == 'o');
        boolean z = (str.length() >= 2 && str.charAt(1) == 'z');
        String res = "";

        if (o) {
            res = res + " " + str.charAt(0);
        }
        if (z) {
            res = res + " " + str.charAt(1);
        }
        return res;
    }
}

class StartOzDemo {
    public static void main(String[] args) {
        StartOz startOz = new StartOz();

        System.out.println(startOz.startOz("oxx"));
        System.out.println(startOz.startOz("bzoo"));
        System.out.println(startOz.startOz("ozymandias"));
    }
}