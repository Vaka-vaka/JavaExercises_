/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.generic.ex_003;

public class MyClass {
    public <T> void method(T argument) {
        T variable = argument;

        System.out.println(variable);
    }
}
