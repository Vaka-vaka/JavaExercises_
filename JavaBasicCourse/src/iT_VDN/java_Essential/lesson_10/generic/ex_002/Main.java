/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.generic.ex_002;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyGenerics<Integer, Integer> instance1 = new MyGenerics<>(1, 2);
        System.out.println(instance1.variable1 + instance1.variable2);

        MyGenerics<String, Integer> instance2 = new MyGenerics<>("Number ", 1);
        System.out.println(instance2.variable1 + instance2.variable2);

        MyGenerics<String, String> instance3 = new MyGenerics<>("Hello ", "World");
        System.out.println(instance3.variable1 + instance3.variable2);
    }
}
