/**
 * Использование специально создаваемого исключения
 *
 * @author Valentyn Mozul
 * @version 1.0 from 09.06.2023
 */

package java.Herbert_Shield.chapter_9;

//Исключение для ошибок, связаннь� с пустой очередью
public class QueueEmptyException extends Exception {
    int empty;

    public String toString() {
        return "\nОчередь пуста.";
    }
}
