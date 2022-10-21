/**
 * Using a loop like for-each
 *
 * @author Valentyn Mozul
 * @version 1.0 from 20.10.2022
 */

package chapter_5;

public class For_each {

    int for_each(int[] each){
        int sum =0;
        for (int x : each){
            System.out.println("Значення - " + x);
            sum += x;
            System.out.println("sum = " + sum);
        }
        return sum;
    }
}

class For_eachDemo{
    public static void main(String[] args) {
        For_each forEach = new For_each();
        int result = forEach.for_each(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println("Сума = " + result);
    }
}
