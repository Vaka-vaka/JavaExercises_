/**
 * Dynamic queue
 * Динамическая очередь
 *
 * @author Valentyn Mozul
 * @version 1.0 from 26.02.2023
 */

package chapter_8.IQDemo;

import chapter_8.IcharQ.IChar_Q;
 class DynQueue implements IChar_Q {
    private char[] q; //массив для хранения элементов очереди
    private int putloc, getloc;

    //Создание пустой очереди заданного размера
    public DynQueue(int size){
        q = new char[size + 1]; //вьщеление памяти для очереди
        putloc = getloc = 0;
    }
    // Помещение символа в очередь
    @Override
    public void put(char ch) {
        if(putloc == q.length-1){
            //Увеличение размера очереди
            char[] t = new char[q.length * 2];
            // Копирование элементов в новую очередь
            for (int i = 0; i < q.length; i++){
                t[i] = q[i];
                q = t;
            }
            putloc++;
            q[putloc] = ch;
        }
    }

    //Извлечение символа из очереди
    @Override
    public char get() {
        if(getloc == putloc){
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
