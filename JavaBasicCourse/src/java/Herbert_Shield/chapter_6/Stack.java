/**
 * Improved class of stack designed
 * to store character values
 *
 * @author Valentyn Mozul
 * @version 1.0 from 15.12.2022
 */

package java.Herbert_Shield.chapter_6;

public class Stack {
    private char[] q;

    private int pushlog;

    Stack(int size){
       q = new char[size + 1];
       pushlog = 0;
    }

    Stack(Stack ob) {
        pushlog = ob.pushlog;
        q = new char[ob.q.length];

        // Копирование элементов в очередь
        for (int i = 0; i <= pushlog; i++)
            q[i] = ob.q[i];
    }

    Stack(char chars[]) {
        pushlog = 0;
        q = new char[chars.length + 1];

        for (int i = 0; i < chars.length; i++) push(chars[i]);
    }

    void push(char ch){
        if(pushlog == q.length){
            System.out.println(" - Очередь заполнена .");
            return;
        }
        pushlog++;
        q[pushlog] = ch;
    }

    char pop(){
        if(pushlog == 0){
            System.out.println(" - Очередь пуста.");
            return (char) 0;
        }
        pushlog--;
        return q[pushlog + 1];
    }
}

class StackDemo{
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        char[] name = {'T', 'o', 'm'};
        // Создание очереди на основе массива
        Stack queue2 = new Stack(name);

        char ch, ch1;
        int i;

        // Помещение ряда символов в очередь queue1
        for (i = 0; i < 10; i++)
            stack.push((char) ('A' + i));

        // Создание одной очереди на основе другой
        Stack queue3 = new Stack(stack);

        System.out.print("Coдepжимoe stack : ");
        for (i = 0; i < 10; i++) {
            ch = stack.pop();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Coдepжимoe  queue2 : ");
        for (i = 0; i < name.length; i++) {
            ch = queue2.pop();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Coдepжимoe  queue3 : ");
        for (i = 0; i < 10; i++) {
            ch1 = queue3.pop();
            System.out.print(ch1);
        }
    }
}
