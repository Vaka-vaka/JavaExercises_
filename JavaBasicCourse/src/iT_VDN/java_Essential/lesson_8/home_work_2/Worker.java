/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2023-10-21
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_8.home_work_2;

public class Worker {
    // Поля класа Worker
    String fio;
    String post;
    String year;

    // Конструктор с параметрами
    Worker(String fio, String post, String year) {
        this.fio = fio;
        this.post = post;
        this.year = year;
    }

    @Override
    public String toString() {
        return "ФИО = " + this.fio + "Должность = " + this.post + " Год = " + this.year;
    }
}
