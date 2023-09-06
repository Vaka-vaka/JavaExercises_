/**
 * Demonstration of exception handling
 * Демонстрация обработки исключений
 *
 * @author Valentyn Mozul
 * @version 1.0 from 14.03.2023
 */

package java.Herbert_Shield.chapter_9;

public class ExcDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int[] nums = new int[4];

        try { //Создание блока try
            System.out.println("Дo генерации исключения");

            nums[7] = 10; //Попытка выйти за пределы массива nums
            System.out.println("Этa строка не будет отображаться");
        } catch (ArrayIndexOutOfBoundsException exc) { //Перехват ошибок, вызываемых выходом за пределы массива
            System.out.println("Bыxoд за пределы массива!");
        }

        System.out.println("Пocлe инструкции catch");
    }
}
