/**
 * Implement a method that calculates the factorial of a given natural number
 *
 * @author Valentyn Mozul
 * @version 1.0 from 05.10.2022
 */

package Operators_and_Loops;

import java.math.BigInteger;

public class Factorial {
    BigInteger factorial(int value) {

         /*BigInteger bigInteger = BigInteger.ONE;
         for (int i = 1; i <= value; i++){
             bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
         }
        return bigInteger;*/

        /* BigInteger res = BigInteger.valueOf(1);
         for (int i = 1; i <= value; i++){
             res = res.multiply(BigInteger.valueOf(i));
         }
         return res;*/

         /*if (value == 1 || value == 0) {
             return BigInteger.ONE;
         } else {
             return BigInteger.valueOf(value).multiply(factorial(value - 1));
         }*/

        return value == 0 ? BigInteger.ONE : BigInteger.valueOf(value)
                .multiply(factorial(value - 1));
    }
}

class DemoFactorial {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {

        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(5));
    }
}