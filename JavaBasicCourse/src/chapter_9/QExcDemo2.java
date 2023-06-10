/**
 * Использование специально создаваемого исключения
 *
 * @author Valentyn Mozul
 * @version 1.0 from 09.06.2023
 */

package chapter_9;

//Демонстрация исключений при работе с очередью
public class QExcDemo2 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;

        try {
            //Переполнение очереди
            for (i = 0; i < 11; i++) {
                System.out.println("Пoпыткa сохранения : " + (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        } catch (QueueFullException e) {
            System.out.println(e);
        }
        System.out.println();

        try {
            // Попытка извлечения символа из пустой очереди
            for (i = 0; i < 11; i++) {
                System.out.print("Пoлyчeниe очередного символа : ");
                ch = q.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }
    }
}

