/**
 * Demonstration of three implementations of the ICharQ interface
 * Демонстрация трех реализаций интерфейса ICharQ
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.02.2023
 */

package chapter_8.IQDemo;

import chapter_8.IcharQ.IChar_Q;

public class IQDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        IChar_Q iQ;
        char ch;
        int i;

        iQ = q1;
        // Помещение ряда символов в очередь фиксированного размера
        for (i = 0; i < 10; i++){
            iQ.put ((char) ('A' + i));
        }
        //Отображение содержимого очереди
        System.out.println("Coдepжимoe фиксированной очереди : ");
        for (i = 0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        // Помещение ряда символов в динамическую очередь
        for (i = 0; i < 10; i++){
            iQ.put((char) ('Z' - i));
        }
        // Отображение содержимого очереди
        System.out.println("Coдepжимoe динамической очереди : ");
        for (i = 0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
    }
}
