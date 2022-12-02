/**
 * A simple example of recursion
 *
 * @author Valentyn Mozul
 * @version 1.0 from 29.11.2022
 */

package chapter_6;

public class Factorial {
    // Рекурсивный метод
    int factR(int n){
        int result;

        if(n == 1) return 1;
     //   System.out.println(n);
        // Рекурсивный вызов метода factR
        result = factR(n - 1) * n;
      //  System.out.println(n);
        return result;
    }

    // Вариант программы, вычисляющий факториал
    // итеративным способом
    int factI(int n){
        int x, result;

        result = 1;
        for (x = 1; x <= n; x++) result *= x;
        return result;
    }
}

class FactorialDemo{
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        System.out.println("Bычиcлeниe рекурсивным методом");
        System.out.println("Фaктopиaл 3 равен " + factorial.factR(3));
//        System.out.println("Фaктopиaл 4 равен " + factorial.factR(4));
//        System.out.println("Фaктopиaл 5 равен " + factorial.factR(5));
        System.out.println();

        System.out.println("Bычиcлeниe итеративным методом");
        System.out.println("Фaктopиaл 3 равен " + factorial.factI(3));
//        System.out.println("Фaктopиaл 4 равен " + factorial.factI(4));
//        System.out.println("Фaктopиaл 5 равен " + factorial.factI(5));
        System.out.println();
    }
}
