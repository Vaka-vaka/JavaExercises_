/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2024-03-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.api;

import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.constant.TaskState;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.exception.*;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.exception.IllegalArgumentException;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.PersonalTask;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.StudyTask;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.Task;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.WorkTask;

import java.util.List;

public interface TaskManager {
    void addTask(String title, String description, TaskState taskState) throws InvalidTasksStateException, InvalidTasksDataException;

    void addWorkTask(String title, String description, TaskState taskState) throws InvalidTasksDataException, InvalidTasksStateException;

    void addPersonalTask(String title, String description, TaskState taskState) throws InvalidTasksDataException, InvalidTasksStateException;

    void addStudyTask(String title, String description, TaskState taskState) throws InvalidTasksDataException, InvalidTasksStateException;

    List<Task> getAllTasks();

    List<WorkTask> getWorkTasks();

    List<PersonalTask> getPersonalTasks();

    List<StudyTask> getStudyTask();

    void removeTask(int id) throws TaskNotFoundException;

    void removeAllTasks();

    void changeTaskStatus(int id, TaskState taskState) throws TaskNotFoundException;

    List<Task> getTasksByStatus(TaskState taskState);

    List<Task> searchTasks(String keyword) throws InvalidSearchTasksException, TaskNotFoundException;

    Task getTaskById(int id) throws IllegalArgumentException, TaskNotFoundException;

    Task getStudyTaskById(int id) throws IllegalArgumentException, TaskNotFoundException;
}
