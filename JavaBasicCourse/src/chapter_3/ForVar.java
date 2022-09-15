/**
 * Declaring a loop variable in the for loop itself
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

public class ForVar {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        //Вычисление факториала чисел от 1 до 5
        for(int i = 1; i <= 5; i++){
            sum += i;
            fact *= i;
        }
      /*1! =  1
        2! =  1 * 2 = 2
        3! =  1 * 2 * 3 = 6
        4! =  1 * 2 * 3 * 4 = 24
        5! =  1 * 2 * 3 * 4 * 5  = 120*/
        //однако здесь переменная i недоступна
        System.out.println("Cyммa: " + sum);
        System.out.println("Фaктopиaл : " + fact);
    }
}
