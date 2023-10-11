/**
 * java basic
 * lesson 4
 * homeWork_1
 *
 * @version 1.0 from 2023-09-27
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_4.homeWork_1;

public class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Open DOCHandler");
    }

    @Override
    void create() {
        System.out.println("Create DOCHandler");
    }

    @Override
    void change() {
        System.out.println("Change DOCHandler");
    }

    @Override
    void save() {
        System.out.println("Save DOCHandler");
    }
}
