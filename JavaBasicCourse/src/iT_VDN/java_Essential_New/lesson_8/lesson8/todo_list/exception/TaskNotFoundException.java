/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2024-03-21
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.exception;

public class TaskNotFoundException extends Exception {

    public TaskNotFoundException(String message) {
        super(message);
    }
}
