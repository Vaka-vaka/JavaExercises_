/**
 * Demonstration of the use of a temporary copy
 *
 * @author Valentyn Mozul
 * @version 1.0 from 05.10.2022
 */

package java.Herbert_Shield.chapter_5;

public class LengthDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int[] list = new int[10];
        int[] nums = {1, 2, 3};
        int[][] table = { // таблица со строками переменной длины
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        System.out.println("Paзмep list : " + list.length);
        System.out.println("Paзмep nums : "+ nums.length);
        System.out.println("Paзмep tаЫе : " +table.length);
        System.out.println("Paзмep taЬle [O] : "+ table[0].length);
        System.out.println("Paзмep taЫe [1] : " + table[1].length);
        System.out.println("Paзмep tаЫе [2] : " + table[2].length);
        System.out.println();

        // Использовать переменную length для инициализации списка
        for (int i = 0; i < list.length; i++)
            list[i] = i * i;
        System.out.print("Coдepжимoe списка : ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
