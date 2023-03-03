/**
 * Interface for character queue
 * Интерфейс для очереди символов
 *
 * @author Valentyn Mozul
 * @version 1.0 from 20.02.2023
 */

package chapter_8.IcharQ;

public interface IChar_Q {
    // Помещение символа в очередь
    void put(char ch);

    //Извлечение символа из очереди
    char get();

    // сбрасывающий очередь в исходное состояние
    void reset();
}
