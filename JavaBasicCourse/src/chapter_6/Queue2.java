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
    Queue2(Queue2 ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // Копирование элементов в очередь
        for (int i = getloc + 1; i <= putloc; i++)
                q[i] = ob.q[i];
    }

    // Создание очереди на основе массива исходных значений
        Queue2(char a []){
        putloc = 0;
        getloc = 0;
        q = new char[a.length+1];
        }

}
