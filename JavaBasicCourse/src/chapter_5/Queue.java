/**
 * A class that implements a queue for storing characters
 *
 * @author Valentyn Mozul
 * @version 1.0 from 19.10.2022
 */

package chapter_5;
public class Queue {
    char q[];  // массив для хранения элементов очереди
    int[] l; // массив для хранения элементов очереди
    double[] d; // массив для хранения элементов очереди
    int putloc, getlog;  // индексы для вставки и извлечения элементов очереди

    Queue(int size, int suze, double saze){
        q = new char[size]; //выделение памяти для очереди
        l = new int[suze];
        d = new double[(int) saze];
        putloc = getlog = 0;
    }

    // Помещение символа в очередь char
    void put(char ch){
       if(putloc == q.length){
           System.out.println(" - Очередь заполнена");
           return;
       }
       q[putloc++] = ch;
    }
    // Помещение символа в очередь int
    void putInt(int xl){
        if(putloc == l.length){
            System.out.println(" - Очередь заполнена");
            return;
        }
        l[putloc++] = xl;
    }
    // Помещение символа в очередь double
    void putDouble(double xd){
        if (putloc == d.length){
            System.out.println(" - Очередь заполнена");
            return;
        }
        d[putloc++] = xd;
    }

    // Извлечение символа из очереди
    char get(){
        if(getlog == putloc){
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getlog++];
    }

    // Извлечение символа из очереди int
    int getInt(){
        if (getlog == putloc){
            System.out.println(" - Очередь пуста");
            return 0;
        }
        return l[getlog++];
    }

    // Извлечение символа из очереди double
    double getDouble(){
        if (getlog == putloc){
            System.out.println(" - Очередь пуста");
            return 0;
        }
        return d[getlog++];
    }
}

class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100, 200, 200);
       // Queue smallQ = new Queue(4);
        char ch;
        int xl;
        int i;
        double xd;

        System.out.println("Иcпoльзoвaниe очереди ЬigQ для cохранения алфавита");
        // Помещение буквенних символов в очередь ЬigQ
        for (i = 0; i < 26; i++){
            bigQ.put((char) ('A' + i));
        }

        // Извлечение и отображение буквенных символов из очереди ЬigQ
        System.out.println("Coдepжимoe очереди ЬigQ : ");
        for (i=0; i < 26; i++){
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println();
        System.out.println("Иcпoльзoвaниe очереди ЬigQ для cохранения цифри");
        // Помещение цифр символов в очередь ЬigQ
        for (i = 0; i < 99; i++){
            bigQ.putInt(1 + i);
        }
        // Извлечение и отображение цифр символов из очереди ЬigQ
        for (i = 0; i < 99; i++){
            xl = bigQ.getInt();
            if (xl != 0) System.out.print(xl + ";");
        }
        System.out.println();
        System.out.println("Иcпoльзoвaниe очереди ЬigQ для cохранения цифри");
        // Помещение double символов в очередь ЬigQ
        for (i = 0; i < 15; i++){
           bigQ.putDouble(1 + i);
        }
        // Извлечение и отображение double символов из очереди ЬigQ
        for (i = 0; i < 15; i++){
            xd = bigQ.getDouble();
            if (xd != 0) System.out.print(xd + ";");
        }
    }
}