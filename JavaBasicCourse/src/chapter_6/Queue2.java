/**
 * Improved class of queue designed
 * to store character values
 *
 * @author Valentyn Mozul
 * @version 1.0 from 21.11.2022
 */

package chapter_6;

public class Queue2 {
    private char[] q; // массив для хранения элементов очереди
    private int putloc, getloc;  // индексы для вставки и извлечения элементов очереди

    //Создание пустой очереди заданного размера
    Queue2(int size) {
        q = new char[size + 1];  // выделение памяти для очереди
        putloc = getloc = 0;
    }

    // Создание очереди на основе имеющегося объекта Queue2
    Queue2(Queue2 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // Копирование элементов в очередь
        for (int i = getloc + 1; i <= putloc; i++)
            q[i] = ob.q[i];
    }

    // Создание очереди на основе массива исходных значений
    Queue2(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];

        for (int i = 0; i < a.length; i++) put(a[i]);
    }
    // Помещение символа в очередь
    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    // Извлечение символа из очереди
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

class Queue2Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        // Создание пустой очереди для хранения 10 элементов
        Queue2 queue1 = new Queue2(10);

        char[] name = {'T', 'o', 'm'};
        // Создание очереди на основе массива
        Queue2 queue2 = new Queue2(name);

        char ch, ch1;
        int i;

        // Помещение ряда символов в очередь queue1
        for (i = 0; i < 10; i++)
            queue1.put((char) ('A' + i));

        // Создание одной очереди на основе другой
        Queue2 queue3 = new Queue2(queue1);

        System.out.print("Coдepжимoe queue1 : ");
        for (i = 0; i < 10; i++) {
            ch = queue1.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Coдepжимoe  queue2 : ");
        for (i = 0; i < name.length; i++) {
            ch = queue2.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Coдepжимoe  queue3 : ");
        for (i = 0; i < 10; i++) {
            ch1 = queue3.get();
            System.out.print(ch1);
        }
    }
}

