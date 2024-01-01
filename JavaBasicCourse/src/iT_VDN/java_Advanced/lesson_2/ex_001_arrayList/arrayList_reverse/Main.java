/**
 * java advanced
 * lesson 2
 *
 * @version 1.0 from 2023-11-28
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_2.ex_001_arrayList.arrayList_reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
        // Создаем объект arrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Создаем объект BufferedReader, для дальнейшего ввода с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Циклом заполняем массив arrayList значениями с клавиатуры
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите значение [" + i + "]");
            String s = reader.readLine();
            // Добавляем значение в конец массива
            arrayList.add(s);
        }

        // Циклом проходим по всей длине arrayList
        for (int i = 0; i < arrayList.size(); i++) {
            // Записываем значение последнего элемента в переменную j
            int j = arrayList.size() - i - 1;
            // Выводим на экран содержимое j
            System.out.println(arrayList.get(j));
        }
    }
}
