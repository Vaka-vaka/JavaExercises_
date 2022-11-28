/**
 * Initializing one object through another
 *
 * @author Valentyn Mozul
 * @version 1.0 from 21.11.2022
 */

package chapter_6;

public class Summation {
    int sum;

    //Создание объекта на основе целочисленного значения
    Summation(int num) {
        sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
    }

    // Создание одного объекта на основе другого
    Summation(Summation ob) {
        sum = ob.sum;
    }
}

class SummationDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Summation summation = new Summation(5);
        Summation summation1 = new Summation(summation);

        System.out.println("summation.sum = " + summation.sum);
        System.out.println("summation1.sum = " + summation1.sum);
    }
}

