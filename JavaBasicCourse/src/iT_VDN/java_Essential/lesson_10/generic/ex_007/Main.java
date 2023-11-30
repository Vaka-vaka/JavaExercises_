/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-10
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.generic.ex_007;

/**
 * Ограничения параметров типа
 */
class Base {
}

class Derived extends Base {
}

/**
 * T extends Base -  аргумент типа должен являться или быть производным от указанного базового класса.
 */
class MyClass<T extends Base> {
}

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyClass<Base> bc1 = new MyClass<>();

        MyClass<Derived> bc2 = new MyClass<>();

        // MyClass<String> bc3 = new MyClass<>(); помилка - extends тільки Base or Derived
    }
}
