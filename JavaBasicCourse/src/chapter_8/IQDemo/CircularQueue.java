/**
 * Circle queue
 * Кольцевая очередь
 *
 * @author Valentyn Mozul
 * @version 1.0 from 24.02.2023
 */

package chapter_8.IQDemo;

import chapter_8.IcharQ.IChar_Q;

public class CircularQueue implements IChar_Q {
    private char[] q; //массив для хранения элементов очереди
    private int putloc, getloc; //индексы в ставляемых и извлекаемых элементов

    //Создание пустой очереди заданного размера
    public void CircularQueue(int size){
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    // Помещение символа в очередь
    @Override
    public void put(char ch) {

    }

    @Override
    public char get() {
        return 0;
    }
}
