/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2024-03-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.api;

public interface TaskManager {
    void addTask(String title, String description, TaskState taskState);
    void addWokTask(String title, String description, TaskState taskState);
    void addPersonalTask(String title, String description, TaskState taskState);

    List<Task> getAllTasks();
    List<WorkTask> getWorkTasks();
    List<PersonalTask> getPersonalTasks();

    void removeTask(int id);
    void removeAllTasks();


}
