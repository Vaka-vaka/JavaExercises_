/**
 * Write a program that finds all prime numbers in the range
 * 2 to 1 00
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_2;

public class PrimeNumbers {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        /*int i, j;
        boolean isprime;
        for(i = 2; i <= 100; i++){
            isprime = true;
           for(j = 2; j <= i/j; j ++)
            if((i % j) == 0) isprime = false;
            if (isprime)
                System.out.println(i + " - простое число.");*/
        int i,j,count;
        for(i = 2; i<=100; i++)
        {
            count = 0;
            for(j = 1; j <= i; j++)
            {
                if(i%j == 0)
                    count++;
            }
            if(count == 2)
                System.out.println("prime is " + i);
        }
    }
}
