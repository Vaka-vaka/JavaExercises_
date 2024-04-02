/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2024-03-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_8.lesson8;

import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.api.TaskManager;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.constant.TaskState;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.PersonalTask;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.StudyTask;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.Task;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model.WorkTask;
import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.service.TaskManagerImpl;

import java.util.List;

public class Lesson8 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManagerImpl();
        try {
            taskManager.addTask("Buy groceries", "Go to the supermarket and buy vegetables and fruits.", TaskState.TODO);
            taskManager.addWorkTask("Finish presentation", "Prepare slides and practice the presentation.", TaskState.IN_PROGRESS);
            taskManager.addPersonalTask("Exercise", "Go for a 30-minute jog in the park.", TaskState.COMPLETED);
            taskManager.addStudyTask("Exception", "add exception to study task", TaskState.IN_PROGRESS);

            taskManager.addTask("Pay bills", "Pay electricity and internet bills.", TaskState.TODO);
            taskManager.addWorkTask("Write report", "Compile the monthly sales report.", TaskState.IN_PROGRESS);
            taskManager.addPersonalTask("Read a book", "Read the new novel by your favorite author.", TaskState.COMPLETED);
            taskManager.addStudyTask("Study task", "add study task to all task", TaskState.IN_PROGRESS);

            List<Task> taskList = taskManager.getAllTasks();
            System.out.println("All tasks:");
            for (Task task : taskList) {
                System.out.println(task);
            }

            System.out.println("-------------------------------------");
            List<WorkTask> workTasks = taskManager.getWorkTasks();
            System.out.println("Work tasks:");
            for (Task task : workTasks) {
                System.out.println(task);
            }

            System.out.println("-------------------------------------");
            List<PersonalTask> personalTasks = taskManager.getPersonalTasks();
            System.out.println("Personal tasks:");
            for (Task task : personalTasks) {
                System.out.println(task);
            }

            System.out.println("-------------------------------------");
            List<StudyTask> studyTasks = taskManager.getStudyTask();
            System.out.println("Study tasks:");
            for (Task task : studyTasks) {
                System.out.println(task);
            }

            System.out.println("-------------------------------------");
            System.out.println("Selection of tasks by id:");
            System.out.println(taskManager.getTaskById(3));

            System.out.println("-------------------------------------");
            System.out.println("Selection of study tasks by id:");
            System.out.println(taskManager.getStudyTaskById(8));

            System.out.println("-------------------------------------");
            System.out.println("Search tasks:");
            System.out.println(taskManager.searchTasks("study"));

            System.out.println("--------------------------------------");
            System.out.println("Search tasks by status");
            System.out.println(taskManager.getTasksByStatus(TaskState.TODO));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
