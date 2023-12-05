/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.generic.ex_001;

public class MyClass<T> {
    public T field;

    public void method() {
        System.out.println(field.getClass());
    }
}
