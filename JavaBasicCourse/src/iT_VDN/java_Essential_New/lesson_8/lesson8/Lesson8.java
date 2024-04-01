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
            System.out.println("All Tasks:");
            for (Task task : taskList) {
                System.out.println(task);
            }

            System.out.println("-------------------------------------");
            List<WorkTask> workTasks = taskManager.getWorkTasks();
            System.out.println("Work Tasks:");
            for (Task task : workTasks) {
                System.out.println(task);
            }

            System.out.println("-------------------------------------");
            List<PersonalTask> personalTasks = taskManager.getPersonalTasks();
            System.out.println("Personal Tasks:");
            for (Task task : personalTasks) {
                System.out.println(task);
            }

            System.out.println("-------------------------------------");
            List<StudyTask> studyTasks = taskManager.getStudyTask();
            System.out.println("Study Tasks:");
            for (Task task : studyTasks) {
                System.out.println(task);
            }

            System.out.println("------------------------------------");
            System.out.println("Get Study Task:");
            System.out.println(taskManager.getStudyTaskById(7));


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
