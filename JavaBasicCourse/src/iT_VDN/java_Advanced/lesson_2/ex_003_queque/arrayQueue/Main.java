/**
 * java advanced
 * lesson 2
 *
 * @version 1.0 from 2023-11-29
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_2.ex_003_queque.arrayQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        // Создаем объект класс PriorityQueue, начальная емкость - 2, а также создаем анонимный внутренний класс
        Queue<Integer> q = new PriorityQueue<>(2, new Comparator<Integer>() {
            @Override
            // Реализуем обратный метод сортировки при помощи метода compare
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });
        // Вставляем элемент в очередь
        q.offer(7); // change 7
        q.offer(9); // change 9
        System.out.println(q);
        q.offer(1); // change 10
        q.offer(6); // change 11
        System.out.println(q);
        // Методом poll возвращаем и удаляем головной элемент очереди
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);
    }
}
