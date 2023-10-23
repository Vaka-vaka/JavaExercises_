/**
 * java basic
 * lesson 4
 * homeWork_1
 *
 * @version 1.0 from 2023-09-27
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_4.homeWork_1;

public class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Open TXTHandler");
    }

    @Override
    void create() {
        System.out.println("Create TXTHandler");
    }

    @Override
    void change() {
        System.out.println("Change TXTHandler");
    }

    @Override
    void save() {
        System.out.println("Save TXTHandler");
    }
}
