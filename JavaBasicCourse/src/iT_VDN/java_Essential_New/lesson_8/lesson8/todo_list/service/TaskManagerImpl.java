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
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.exception.*;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.exception.IllegalArgumentException;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.PersonalTask;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.StudyTask;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.Task;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.WorkTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskManagerImpl implements TaskManager {

    private final List<Task> taskList = new ArrayList<>();
    public static int taskId = 1;

    @Override
    public void addTask(String title, String description, TaskState taskState)
            throws InvalidTasksStateException, InvalidTasksDataException {
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
    public void addWorkTask(String title, String description, TaskState taskState)
            throws InvalidTasksDataException, InvalidTasksStateException {
        if (title == null || title.isEmpty()) {
            throw new InvalidTasksDataException("Work tasks must have a title!");
        }
        if (taskState == null) {
            throw new InvalidTasksStateException("Work task state cannot be null");
        }
        taskList.add(new WorkTask(taskId, title, description, taskState));
        taskId++;
    }

    @Override
    public void addPersonalTask(String title, String description, TaskState taskState)
            throws InvalidTasksDataException, InvalidTasksStateException {
        if (title == null || title.isEmpty()) {
            throw new InvalidTasksDataException("Personal tasks must have a title!");
        }
        if (taskState == null) {
            throw new InvalidTasksStateException("Personal tasks state cannot be null");
        }
        taskList.add(new PersonalTask(taskId, title, description, taskState));
        taskId++;
    }

    @Override
    public void addStudyTask(String title, String description, TaskState taskState)
            throws InvalidTasksDataException, InvalidTasksStateException {
        if (title == null || title.isEmpty()) {
            throw new InvalidTasksDataException("Study task must have a title!");
        }
        if (taskState == null) {
            throw new InvalidTasksStateException("Study task state cannot be null");
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
        if (id == 0 || id < 0 || taskId < id) {
            throw new TaskNotFoundException("Task with id: " + id + " not found!");
        }
    }

    @Override
    public void removeAllTasks() {
        taskList.clear();
    }

    @Override
    public void changeTaskStatus(int id, TaskState taskState) throws TaskNotFoundException {
        for (Task task : taskList) {
            if (task.getId() == id) {
                task.setTaskState(taskState);
                return; //return
            }
        }
        throw new TaskNotFoundException("Task with id: " + id + " not found!");
    }

    @Override
    public List<Task> getTasksByStatus(TaskState taskState) throws IllegalArgumentException {
        if (taskList.isEmpty()) {
            throw new EmptyTaskListException("Task list is empty!");
        }
        if (taskState == null) {
            throw new IllegalArgumentException("Tasks by status: " + null + " invalid argument!");
        }
        List<Task> listTask = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getTaskState().equals(taskState)) {
                listTask.add(task);
            }
        }
        return listTask;
    }

    @Override
    public List<Task> searchTasks(String keyword) throws InvalidSearchTasksException, SearchTasksNotFoundException {
        if (keyword == null || keyword.equals("")) {
            throw new InvalidSearchTasksException("Search task state cannot be null!");
        }
        List<Task> foundTasks = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getTitle().contains(keyword) || task.getDescription().contains(keyword)) {
                foundTasks.add(task);
            }
        }
        if (foundTasks.isEmpty()) {
            throw new SearchTasksNotFoundException("Search tasks: " + keyword + " not found!");
        }
        return foundTasks;
    }

    @Override
    public Task getTaskById(int id) throws IllegalArgumentException, TaskNotFoundException {
        if (taskList.isEmpty()) {
            throw new EmptyTaskListException("Task list is empty!");
        }
        for (Task task : taskList) {
            if (task.getId() == id) {
                return task;
            }
        }
        if (id <= 0) {
            throw new IllegalArgumentException("Id:" + id + " is not negative or null!");
        } else {
            throw new TaskNotFoundException("Task with id: " + id + " not found!");
        }
    }

    @Override
    public Task getStudyTaskById(int id) throws IllegalArgumentException, TaskNotFoundException {
        if (taskList.isEmpty()) {
            throw new EmptyTaskListException("Task list is empty!");
        }
        for (int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i) instanceof StudyTask) {
                if (taskList.get(i).getId() == id) {
                    return taskList.get(i);
                }
            }
        }
        if (id <= 0) {
            throw new IllegalArgumentException("Id:" + id + " is not negative or null!");
        } else {
            throw new TaskNotFoundException("Task with id: " + id + " not found!");
        }
    }
}
