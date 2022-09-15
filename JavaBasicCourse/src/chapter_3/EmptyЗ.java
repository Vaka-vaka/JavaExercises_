/**
 * The body of the for loop can be empty
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

public class EmptyЗ {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int i;
        int sum = 0;

        //суммируются числа от 1 до 5
        //sum = sum + i; i ++;
        for(i = 0; i <= 5; sum += i++);
        System.out.println("Cyммa : " + sum);
    }
}
