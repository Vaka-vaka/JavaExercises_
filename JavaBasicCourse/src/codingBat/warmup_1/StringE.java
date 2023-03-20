/**
 * stringE
 *
 * @author Valentyn Mozul
 * @version 1.0 from 28.12.2022
 */

/*
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
*/

package codingBat.warmup_1;

public class StringE {
    boolean stringE(String str){
       int count = 0, count2 = 0;
       for(int i = 0; i < str.length(); i++){
           if(str.charAt(i) == 'e') count++;
           if(str.substring(i).equals("l")) count2++;
       }
        System.out.println(count);
        System.out.println(count2);
       return ((count >= 1 && count <= 3) && (count2 >= 1 && count2 <= 3));
    }
}

class StringEDemo{
    public static void main(String[] args) {
        StringE stringE = new StringE();
        System.out.println(stringE.stringE("Hellell"));
        System.out.println(stringE.stringE("Helleeell"));
    }
}