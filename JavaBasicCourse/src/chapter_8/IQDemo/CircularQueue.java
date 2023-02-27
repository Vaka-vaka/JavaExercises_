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
    public CircularQueue(int size){
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    // Помещение символа в очередь
    @Override
    public void put(char ch) {
        // Очередь считается полной, если индекс putloc на единицу
        // меньше индекса getloc или если индекс putloc указывает
        // на конец массива, а индекс getloc - на его начало
        if(putloc + 1 == getloc | (putloc == q.length - 1 && getloc == 0)){
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc ++] = ch;
        if(putloc == q.length) putloc = 0;
    }

    //Извлечение символа из очереди
    @Override
    public char get() {
       if(putloc == getloc){
           System.out.println(" - Очередь пуста");
           return (char) 0;
       }
       char ch = q[getloc++];
       if(getloc == q.length) getloc = 0; //вернуться в начало очереди
        return q[getloc];
    }
}
