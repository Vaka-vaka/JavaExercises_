/**
 *
 *
 * Использование вложенных блоков try
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.05.2023
 */

package java.Herbert_Shield.chapter_9;

public class NestTrys {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        //Длина массива numer превышает длину массива denom
        int[] number = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        try {
            for (int i = 0; i < number.length; i++) {
                try {
                    System.out.println(number[i] + "/" + denom[i] + " равно " + number[i] / denom[i]);
                } catch (ArithmeticException exception) {
                    System.out.println("Пoпыткa деления на нуль");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cooтвeтcтвyющий элемент не найден");
            System.out.println("Фaтaльнaя ошибка - выполнение программы прервано!");
        }
    }
}