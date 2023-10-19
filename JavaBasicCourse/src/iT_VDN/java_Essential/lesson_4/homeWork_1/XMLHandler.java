/**
 * java basic
 * lesson 4
 * homeWork_1
 *
 * @version 1.0 from 2023-09-27
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_4.homeWork_1;

public class XMLHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Open XMLHandler");
    }

    @Override
    void create() {
        System.out.println("Create XMLHandler");
    }

    @Override
    void change() {
        System.out.println("Change XMLHandler");
    }

    @Override
    void save() {
        System.out.println("Save XMLHandler");
    }
}
