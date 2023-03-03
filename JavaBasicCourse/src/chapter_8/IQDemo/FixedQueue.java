/**
 * A class that implements a fixed size queue for storing characters
 * Класс, реализующий очередь фиксированного размера
 * для хранения символов
 *
 * @author Valentyn Mozul
 * @version 1.0 from 20.02.2023
 */

package chapter_8.IQDemo;

import chapter_8.IcharQ.IChar_Q;

public class FixedQueue implements IChar_Q {

    private char[] q; //массив для хранения элементов очереди
    private int putloc, getloc; //индексы в ставляемых и извлекаемых элементов

    //Создание пустой очереди заданного размера
    public FixedQueue(int size) {
        q = new char[size]; //выделение памяти для очереди
        putloc = getloc = 0;
    }

    // Помещение символа в очередь
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
    }

    // Извлечение символа из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }

    @Override
    public void reset() {
        putloc = 0;
        getloc = 0;
    }
}


