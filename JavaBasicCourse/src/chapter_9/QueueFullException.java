/**
 * Использование специально создаваемого исключения
 *
 * @author Valentyn Mozul
 * @version 1.0 from 09.06.2023
 */

package chapter_9;

//Исключение для ошибок, связанных с заполненной очередью
public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {
        this.size = s;
    }

    public String toString() {
        return "\nОчередь заполнена. Максимальный размер " + size;
    }
}
