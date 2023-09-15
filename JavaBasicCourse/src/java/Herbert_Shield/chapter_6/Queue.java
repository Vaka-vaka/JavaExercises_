/**
 * Improved class of queue designed
 * to store character values
 *
 * @author Valentyn Mozul
 * @version 1.0 from 15.11.2022
 */

package java.Herbert_Shield.chapter_6;

public class Queue {
    // Эти члены класса теперь являются закрытыми
    private char q[];  // массив для хранения элементов очереди
    private int putloc, getloc; // индексы для вставки и извлечения элементов очереди

    Queue(int size) {
        q = new char[size];         // выделение памяти для очереди
        putloc = getloc = 0;
    }

    // Помещение символа в очередь
    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена .");
            return;
        }
        q[putloc++] = ch;
    }

    // Извлечение символа из очереди
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class QDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.get();
        queue.put('a');
    }
}
