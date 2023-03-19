/**
 * This program will not work!
 * Эта программа не будет работать!
 *
 * @author Valentyn Mozul
 * @version 1.0 from 19.03.2023
 */

package chapter_9;

public class ExcTypeMismatch {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int[] nums = new int[4];

        try {
            //Сгенерировать исключение в связи с
            //выходом индекса за пределы массива

            System.out.println("Дo генерации исключения");
            nums[7] = 10; // ArrayindexOutBoundsException (Выбрасывается, чтобы указать,
            // что к массиву был получен доступ с
            // недопустимым индексом. Индекс либо отрицательный,
            // либо больше или равен размеру массива.)
        }
        //Исключение , связанное с обращением за пределы массива ,
        //нельзя обработать с помощью инструкции catch, в которой
        //указан тип исключения ArithmeticException
        catch (ArithmeticException exc) {  // Выбрасывается при возникновении исключительного арифметического
            // условия. Например, целое число "делить на ноль" выбрасывает
            // экземпляр этого класса.
            System.out.println("Bыxoд за пределы массива !");
        }
        System.out.println("Пocлe инструкции catch");
    }
}
