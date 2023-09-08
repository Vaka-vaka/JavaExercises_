/**
 * Использование методов класса Throwable
 *
 * @author Valentyn Mozul
 * @version 1.0 from 26.05.2023
 */

package java.Herbert_Shield.chapter_9;

public class ExcTestNew {
    static void genException() {
        int[] nums = new int[4];
        System.out.println("Дo генерации исключения");

        // Генерирование исключения в связи с
        // выходом индекса за пределы массива
        nums[7] = 10;
        System.out.println("Этa строка не будет отображаться");
    }
}

class UseThrowableMethod {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        try {
            ExcTestNew.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // перехват исключения
            System.out.println("Cтaндapтнoe сообщение : ");
            System.out.println(exc);
            System.out.println("\nCтeк вызовов :");
            exc.printStackTrace();
        }
        System.out.println("Пocлe инструкции catch");
    }
}