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
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.exception.EmptyTaskListException;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.exception.InvalidTasksDataException;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.exception.InvalidTasksStateException;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.exception.TaskNotFoundException;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.PersonalTask;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.StudyTask;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.Task;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.WorkTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskManagerImpl implements TaskManager {

    private final List<Task> taskList = new ArrayList<>();
    public static int taskId = 0;

    @Override
    public void addTask(String title, String description, TaskState taskState) throws InvalidTasksStateException, InvalidTasksDataException {
        if (title == null || title.isEmpty()) {
            throw new InvalidTasksDataException("Tasks must have a title!");
        }
        if (taskState == null) {
            throw new InvalidTasksStateException("Task state cannot be null");
        }
        taskList.add(new Task(taskId, title, description, taskState));
        taskId++;
    }

    @Override
    public void addWorkTask(String title, String description, TaskState taskState) throws InvalidTasksDataException, InvalidTasksStateException {
        if (title == null || title.isEmpty()) {
            throw new InvalidTasksDataException("WorkTasks must have a title!");
        }
        if (taskState == null) {
            throw new InvalidTasksStateException("WorkTask state cannot be null");
        }
        taskList.add(new WorkTask(taskId, title, description, taskState));
        taskId++;
    }

    @Override
    public void addPersonalTask(String title, String description, TaskState taskState) throws InvalidTasksDataException, InvalidTasksStateException {
        if (title == null || title.isEmpty()) {
            throw new InvalidTasksDataException("PersonalTasks must have a title!");
        }
        if (taskState == null) {
            throw new InvalidTasksStateException("PersonalTasks state cannot be null");
        }
        taskList.add(new PersonalTask(taskId, title, description, taskState));
        taskId++;
    }

    @Override
    public void addStudyTask(String title, String description, TaskState taskState) throws InvalidTasksDataException, InvalidTasksStateException {
        if (title == null || title.isEmpty()) {
            throw new InvalidTasksDataException("StudyTask must have a title!");
        }
        if (taskState == null) {
            throw new InvalidTasksStateException("StudyTask state cannot be null");
        }
        taskList.add(new StudyTask(taskId, title, description, taskState));
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
    public List<StudyTask> getStudyTask() {
        List<StudyTask> studyTasks = new ArrayList<>();
        for (Task task : taskList) {
            if (task instanceof StudyTask) {
                studyTasks.add((StudyTask) task);
            }
        }
        return studyTasks;
    }

    @Override
    public void removeTask(int id) throws TaskNotFoundException {
        if (taskList.isEmpty()) {
            throw new EmptyTaskListException("Task list is empty!");
        }
        Iterator<Task> iterator = taskList.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getId() == id) {
                iterator.remove();
                break;
            }
        }
        throw new TaskNotFoundException("Task with id: " + id + " not found!");
    }

    @Override
    public void removeAllTasks() {
        taskList.clear();
    }

    @Override
    public void changeTaskStatus(int id, TaskState taskState) throws TaskNotFoundException {
        for (Task task : taskList) {
            if(task.getId() == id) {
                task.setTaskState(taskState);
                return; //return
            }
        }
        throw new TaskNotFoundException("Task with id: " + id + " not found!");
    }

    @Override
    public List<Task> getTasksByStatus(TaskState taskState) {
        return null;
    }

    @Override
    public List<Task> searchTasks(String keyword) {
        List<Task> foundTasks = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getTitle().contains(keyword) || task.getDescription().contains(keyword)) {
                foundTasks.add(task);
            }
        }
        return foundTasks;
    }

    @Override
    public Task getTaskById(int id) {
        return null;
    }

    @Override
    public Task getStudyTaskById(int id) {
        return null;
    }
}
