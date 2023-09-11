/**
 * Interface for character queue
 * Интерфейс для очереди символов
 *
 * @author Valentyn Mozul
 * @version 1.0 from 20.02.2023
 */

package java.Herbert_Shield.chapter_8.icharQ;

import java.Herbert_Shield.chapter_9.QueueEmptyException;
import java.Herbert_Shield.chapter_9.QueueFullException;

public interface IChar_Q {
    // Помещение символа в очередь
    void put(char ch) throws QueueFullException;

    //Извлечение символа из очереди
    char get() throws QueueEmptyException;

    // сбрасывающий очередь в исходное состояние
    void reset();
}
