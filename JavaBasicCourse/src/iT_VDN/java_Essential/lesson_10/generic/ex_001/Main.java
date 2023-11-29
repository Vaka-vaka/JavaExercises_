/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.generic.ex_001;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        // Создаем экземпляр класса MyClass и в качестве параметра типа (тип MyClass) передаем тип String.
        MyClass<String> instance1 = new MyClass<String>();
        instance1.field = "ABC";
        instance1.method();

        // В качестве параметра типа передавать примитивные типы (int, long, float, double, и так далее) нельзя.
        //MyClass<int> instance2 = new MyClass<int>();
        //instance2.method();

        // Создаем экземпляр класса MyClass и в качестве параметра типа (тип MyClass) передаем тип Integer.
        MyClass<Integer> instance2 = new MyClass<Integer>();
        instance2.field = 1234;
        instance2.method();
    }
}
