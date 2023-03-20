/**
 * Given a string, if the string "del" appears starting at index 1,
 * return a string where that "del" has been deleted. Otherwise, return the string unchanged
 *
 * @author Valentyn Mozul
 * @version 1.0 from 12.12.2022
 */

/*
delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
*/

package codingBat.warmup_1;

public class DelDel {
    public String delDel(String str) {
        if (str.length() > 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }
}

class DelDelDemo {
    public static void main(String[] args) {
        DelDel delDel = new DelDel();

        System.out.println(delDel.delDel("adelbc"));
        System.out.println(delDel.delDel("adelHello"));

    }
}
