/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2024-03-28
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.model;

import iT_VDN.java_Essential_New.lesson_8.lesson8.todo_list.constant.TaskState;

public class StudyTask extends Task {

    public StudyTask(int id, String title, String description, TaskState taskState) {
        super(id, title, description, taskState);
    }

    @Override
    public String toString() {
        return "StudyTask{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", taskState=" + getTaskState() +
                '}';
    }
}
