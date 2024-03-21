/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2024-03-19
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.service;

import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.api.TaskManager;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.constant.TaskState;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.PersonalTask;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.Task;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.WorkTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskManagerImpl implements TaskManager {

    private final List<Task> taskList = new ArrayList<>();
    public static int taskId = 0;

    @Override
    public void addTask(String title, String description, TaskState taskState) {
        taskList.add(new Task(taskId, title, description, taskState));
        taskId++;
    }

    @Override
    public void addWokTask(String title, String description, TaskState taskState) {
        taskList.add(new WorkTask(taskId, title, description, taskState));
        taskId++;
    }

    @Override
    public void addPersonalTask(String title, String description, TaskState taskState) {
        taskList.add(new PersonalTask(taskId, title, description, taskState));
        taskId++;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskList;
    }

    @Override
    public List<WorkTask> getWorkTasks() {
        List<WorkTask> workTasks = new ArrayList<>();
        for (Task task : taskList) {
            if (task instanceof WorkTask) {
                workTasks.add((WorkTask) task);
            }
        }
        return workTasks;
    }

    @Override
    public List<PersonalTask> getPersonalTasks() {
        List<PersonalTask> personalTasks = new ArrayList<>();
        for (Task task : taskList) {
            if (task instanceof PersonalTask) {
                personalTasks.add((PersonalTask) task);
            }
        }
        return personalTasks;
    }

    @Override
    public void removeTask(int id) {
        Iterator<Task> iterator = taskList.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }

    @Override
    public void removeAllTasks() {

    }

    @Override
    public void changeTaskStatus(int id, TaskState taskState) {

    }

    @Override
    public List<Task> getTasksByStatus(TaskState taskState) {
        return null;
    }

    @Override
    public List<Task> searchTasks(String keyword) {
        return null;
    }

    @Override
    public Task getTaskById(int id) {
        return null;
    }
}
