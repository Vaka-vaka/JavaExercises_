/**
 * Demonstration of code blocks
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package primitiveTypes;

public class BlockDemo {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        double i, j, d;
        i = 5;
        j = 10;

        if(i != 0){
            System.out.println(" i не равно нулю");
            d = j / i;
            System.out.println("j / i равно " + d);
        }
    }
}
