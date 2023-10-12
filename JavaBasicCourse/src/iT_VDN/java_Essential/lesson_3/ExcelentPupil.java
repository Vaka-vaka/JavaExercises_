/**
 * java basic
 * lesson 3
 *
 * @version 1.0 from 2023-09-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_3;

public class ExcelentPupil extends Pupil {

    @Override
    public void study() {
        System.out.println("study - " + "відмінно");
    }

    @Override
    public void read() {
        System.out.println("read - " + "відмінно");
    }

    @Override
    public void write() {
        System.out.println("write - " + "відмінно");
    }

    @Override
    public void relax() {
        System.out.println("relax - " + "мало");
    }
}
