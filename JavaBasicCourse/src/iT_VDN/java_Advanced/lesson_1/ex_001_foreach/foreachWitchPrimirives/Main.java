/**
 * java advanced
 * lesson 1
 *
 * @version 1.0 from 2023-11-16
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_1.ex_001_foreach.foreachWitchPrimirives;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int[] x = {2, 5, 6, 8, 9, 3};

        // Вывод на экран элементов массива x при помощи цикла for
        System.out.println("for = ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

        // Вывод на экран элементов массива x при помощи цикла foreach
        System.out.println("foreach = ");
        for (int tmp : x) {
            System.out.print(tmp + " ");
        }
        System.out.println();

        // Изменения значения поля класса
        System.out.println("Изменения значения поля класса = ");
        for (int tmp : x) {
            ++tmp;
            System.out.print(tmp + " ");
        }
        System.out.println();

//        // Вывод на экран элементов массива x при помощи цикла foreach
        System.out.println("Вывод на экран элементов массива x при помощи цикла foreach");
        for (int tmp : x) {
            System.out.print(tmp + " ");
        }
    }
}
