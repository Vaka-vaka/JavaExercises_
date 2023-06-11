/**
 * Использование специально создаваемого исключения
 *
 * @author Valentyn Mozul
 * @version 1.0 from 09.06.2023
 */

package chapter_9;

import chapter_8.icharQ.IChar_Q;

// Класс очереди фиксированного размера для символов,
// использующий исключения
public class FixedQueue implements IChar_Q {
    private char[] q; // массив для хранения элементов очереди

    private int putlog, getlog; // индексы вставляемых и извлекаемых элементов

    //Создание пустой очереди заданного размера
    public FixedQueue(int size) {
        q = new char[size]; //выделение памяти для очереди
        putlog = getlog = 0;
    }

    //Помещение символа в очередь
    @Override
    public void put(char ch) throws QueueFullException {
        if (putlog == q.length)
            throw new QueueFullException(q.length);

        q[putlog++] = ch;
    }

    //Извлечение символа из очереди
    @Override
    public char get() throws QueueEmptyException {
        if (getlog == putlog)
            throw new QueueEmptyException();

        return q[getlog++];
    }

    @Override
    public void reset() {
    }
}
