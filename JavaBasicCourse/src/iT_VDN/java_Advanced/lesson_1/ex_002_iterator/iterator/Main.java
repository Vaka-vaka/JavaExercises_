/**
 * java advanced
 * lesson 1
 *
 * @version 1.0 from 2023-11-16
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_1.ex_002_iterator.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(8);

        System.out.println(al);

        // с помощью итератора можем бегать по нашему списку
        Iterator<Integer> iterator = al.iterator();

        // спрашиваем есть ли следующий элемент в списке, если true, то будет реализовано тело while
        while (iterator.hasNext()) {
            // переходим к следующему элементу в списке и его выводим
            Integer mpt = iterator.next();
            System.out.println(mpt);
        }

        // то же самое действие, но через оптимизированный итератор под cписки
        ListIterator<Integer> listIterator = al.listIterator();

        while (listIterator.hasNext()) {
            Integer mpt = listIterator.next();
            System.out.println(mpt);
        }
    }
}
