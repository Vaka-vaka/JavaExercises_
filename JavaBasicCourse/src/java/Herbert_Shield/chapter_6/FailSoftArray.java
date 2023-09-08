/**
 * In this class, a "resistive" array is implemented,
 * which prevents runtime errors
 *
 * @author Valentyn Mozul
 * @version 1.0 from 15.11.2022
 */

package java.Herbert_Shield.chapter_6;

public class FailSoftArray {
    private int a[];       // ссылка на массив
    private int errval;     // значение, возвращаемое в случае
    // в озникновения ошибки при выполнении
    // метода get()
    public int length;      // открытая переменная length

    // Конструктору данного класса передаются размер массива
    // и значение, которое должен возвращать метод get() при возникновении ошибки
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    // Возврат значения элемента массива с заданным индексом
    public int get(int index) {
        if (indexOK(index)) return a[index];
        return errval;
    }

    // Установка значения элемента с заданным индексом.
    // Если возникнет ошибка, вернуть логическое значение false.
    public boolean put(int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    // Возврат логического значения true, если индекс
    // не выходит за пределы массива
    private boolean indexOK(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}

// Демонстрация работы с " отказоустойчивым" массивом
class FSDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // Демонстрация корректной обработки ошибок
        System.out.println("Oбpaбoткa ошибок без вывода отчета.");
        for (int i = 0; i < (fs.length * 2); i++) {
            fs.put(i, i * 10);
        }

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
        }
        System.out.println("");

        // Обработка ошибок
        System.out.println("\nOбpaбoткa ошибок с выводом отчета.");
        for (int i = 0; i < (fs.length * 2); i++) {
            if (!fs.put(i, i * 10)) System.out.println("Индeкc " + i +
                    " вне допустимого диапазона");
        }

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else System.out.println("Индeкc " + i +
                    " вне допустимого диапазона");
        }
    }
}
