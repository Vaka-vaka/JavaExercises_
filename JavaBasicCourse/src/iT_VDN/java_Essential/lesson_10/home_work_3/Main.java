/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-13
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.home_work_3;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyDictionary<Integer, String> myDictionary = new MyDictionary<>();
        myDictionary.addMethod(1983, "Vaka");
        myDictionary.addMethod(1988, "Nata");
        myDictionary.addMethod(1989, "NaTa");

        System.out.println(myDictionary.getDictionary());
        System.out.println("IndexMethod = " + myDictionary.indexMethod(1989));
        System.out.println("CountMethod = " + myDictionary.getCountMethod());
    }
}
