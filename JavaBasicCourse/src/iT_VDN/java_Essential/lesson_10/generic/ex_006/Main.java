/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-09
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.generic.ex_006;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyClass<Integer> my = new MyClass<>();
        int sum = my.add(2, 3);
        System.out.println("Integer = " + sum);

        MyClass<Double> myD = new MyClass<>();
        double sumD = myD.add(2.2, 3.3);
        System.out.println("Double = " + sumD);
    }
}
