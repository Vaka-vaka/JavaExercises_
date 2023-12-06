/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-09
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.generic.ex_006;

public class MyClass<T> {
    public T add(T a, T b) {
        if (a.getClass().equals(Integer.class)) {
            return (T) (Object) ((Integer) a + (Integer) b);
        }
        if (a.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) a + (Double) b);
        }
        return (T) (Object) 0;
    }
}
