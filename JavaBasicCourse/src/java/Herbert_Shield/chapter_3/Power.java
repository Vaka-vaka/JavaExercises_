/**
 * Calculation of integer powers of number 2
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_3;

public class Power {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int e, result;
        for(int i = 0; i < 10; i++){
            result = 1;
            e = i;
            while (e > 0){
                result*= 2;
                e--;
            }
            System.out.println(" 2 в степени " + i + " равно " + result);
        }
    }
}
