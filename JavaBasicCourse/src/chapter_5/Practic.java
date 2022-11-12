/**
 * Practic chapter_5
 *
 * @author Valentyn Mozul
 * @version 1.0 from 12.11.2022
 */

package chapter_5;

public class Practic {

    public static void main(String[] args) {
        //1
        double[] doub = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 0; i < doub.length; i++) {
            System.out.println(i + " - " + doub[i] + " ");
        }
        System.out.println("___________________-");
        double d[];
        d = new double[13];
        for (int i = 1; i < d.length; i++) {
            d[i] = i;
            System.out.println(i + " - " + d[i] + " ");
        }
        //2
        System.out.println();
        int[] n = new int[6];
        for (int i = 1; i < 6; i++) {
            n[i] = i;
            System.out.println(n[i]);
        }
        //3 среднее арифметическое - сумма всех чисел деленная на их количество
        System.out.println();
        double[] numbers = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};

        double average;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = sum / numbers.length;
        System.out.println("Среднее арифметическое " + average);
        System.out.println();
        //4
        // Инициализируем массив и переменные
        String[] str = {"I ", "am ", "Valentin. ", "I ", "am ", "fine, ", "are ", "you", "?"};

        String s;
        int size = str.length;
        // Отображение исходного массива
        System.out.print("Исходный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + str[i]);
        }
        System.out.println();
        // Реализация алгоритма пузырьковой сортировки
        int y;
        for (int i = 1; i < size; i++) {
            for (y = size - 1; y >= i; y--) {
                if (str[y - 1].compareTo(str[y]) >= 0) {
                    s = str[y - 1];
                    str[y - 1] = str[y];
                    str[y] = s;
                }
            }
        }
        // Отображение отсортированного массива
        System.out.print("Отстортированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println("__________________________");
        //5
        String strW = "Мне нравится Java";
        for (int i = 0; i < strW.length(); i++) {
            System.out.print(strW.charAt(i));
        }
        System.out.println();
        System.out.print(strW.charAt(13));
        System.out.print(strW.charAt(14));
        System.out.print(strW.charAt(15));
        System.out.print(strW.charAt(16));
        System.out.println();
        System.out.println(strW.length());
        //9
        int y1, x = 5;
        y1 = x < 0 ? 10 : 20;
        System.out.println("y = " + y1);
        //13
        int[] nums = {1, 33, 444, 223, 12, 55, 433, 122, 5, 6};
        int min, max;

        min = max = nums[0];
        for (int z : nums) {
            if (z < min) min = z;
            if (z > max) max = z;
        }
        System.out.println("min and max " + min + " " + max);
    }
}
