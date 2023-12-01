/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-13
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.home_work_2;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.addMethod("Coca");
        myList.addMethod("Soca");

        System.out.println(myList.getList());
        System.out.println(myList.getIndexMethod("Coca"));
        System.out.println(myList.countMethod());
    }
}
