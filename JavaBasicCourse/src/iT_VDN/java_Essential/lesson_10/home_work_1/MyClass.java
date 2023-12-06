/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-13
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.home_work_1;

public class MyClass<T> {
   public static <T> void factoryMethod(T t1) {
       System.out.println(t1.toString());
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyClass.factoryMethod(new Double(3.14));
        factoryMethod(new Integer(10000));
        factoryMethod(new String("Coffee"));
        factoryMethod(new Character('S'));
    }
}
