/**
 * java advanced
 * lesson 2
 *
 * @version 1.0 from 2023-11-29
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_2.ex_003_queque.arrayDeque;

import java.util.ArrayDeque;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        // Создаем объект ArrayDeque
        ArrayDeque<String> states = new ArrayDeque<>();
        // Стандартное добавление элементов
        states.add("Украина");
        states.add("Франция");

        // Добавляем элемент в самое начало
        states.push("Великобритания");

        // Получаем первый элемент без удаления
        String sFirst = states.getFirst();
        String sLast = states.getLast();

        while (states.peek() != null) {
            // Извлечение c начала
            System.out.println(states.pop());
        }
        System.out.println("Размер очереди: " + states.size());

        ArrayDeque<Person> people = new ArrayDeque<>();
      //  people.addFirst(new Person("Tom"));
      //  people.addLast(new Person("Nick"));
        for (Person p : people) {
            System.out.println(p.getName());
        }
    }
}
