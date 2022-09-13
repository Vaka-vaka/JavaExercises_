/**
 * Output the square roots of numbers from 1 to 99 along with rounding error
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

public class SqrRoot {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        double num, sroot, rerr;

        for(num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("Kopeнь квадратный из " + num + "  равен " + sroot);

            //Вычисление ошибки округления
            rerr = num - (sroot * sroot);
            System.out.println ("Oшибкa округления : " + rerr);
            System.out.println ();
        }
    }
}
