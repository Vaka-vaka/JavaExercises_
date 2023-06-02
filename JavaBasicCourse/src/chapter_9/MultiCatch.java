/**
 * Use the exception handling tool to handle exceptions in bulk.
 * Note: JDK 7 or higher is required to compile this code.
 * <p>
 * Исполь зование средства группового перехвата исключений .
 * Примечание : для компиляции этого кода требуется JDK 7 или выше .
 *
 * @author Valentyn Mozul
 * @version 1.0 from 02.06.2023
 */

package chapter_9;

public class MultiCatch {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int a = 88;
        int b = 0;
        int result;
        char[] ch = {'A', 'B', 'C'};

        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0) {
                    result = a / b;  //Генерирование исключения
                    // ArithmeticExcept ion
                } else {
                    ch[5] = 'X';  // Генериров ание исключения
                    // ArraylndexOutOfBoundsExcept ion
                }

                // В этой инструкции catch организуется перехват
                // обоих исключений
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println(" Пepexвaчeннoe исключение : " + e);
            }
        }
        System.out.println("Пocлe группового перехватчика исключений");
    }
}
