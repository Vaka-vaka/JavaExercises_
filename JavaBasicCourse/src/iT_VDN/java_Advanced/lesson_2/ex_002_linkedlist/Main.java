/**
 * java advanced
 * lesson 2
 *
 * @version 1.0 from 2023-11-28
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_2.ex_002_linkedlist;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        // Вызываем метод, измеряющий время 10 тысячи вставок в список
        System.out.println("ArrayList = " + getTimeMsOfInsert(new ArrayList()));
        System.out.println("LinkedList = " + getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) {
        // Создаем объект Date
        Date currentTime = new Date();
        // Вызываем метод insert10000
        insert10000(list);
        Date newTime = new Date();
        // Вычисляем разницу между currentTime и  newTime
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time distance is: " + msDelay + " in ms");
        return msDelay;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 100000; i++) {
            // Вставляем в начало объекты
            list.add(0, new Object());
        }
    }
}
