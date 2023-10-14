/**
 * java basic
 * lesson 3
 *
 * @version 1.0 from 2023-09-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_3;

public class GoodPupil extends Pupil {

    @Override
    public void study() {
        System.out.println("study - " + "добре");
    }

    @Override
    public void read() {
        System.out.println("read - " + "добре");
    }

    @Override
    public void write() {
        System.out.println("write - " + "добре");
    }

    @Override
    public void relax() {
        System.out.println("relax - " + "краще відмінника");
    }
}
