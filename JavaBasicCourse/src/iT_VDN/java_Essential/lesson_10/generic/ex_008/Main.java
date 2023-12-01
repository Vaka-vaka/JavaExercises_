/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-10
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.generic.ex_008;

interface Interface1 { /* ... */
}

interface Interface2<U> { /* ... */
}

class Derived implements Interface1, Interface2<Object> { /* ... */
}

// T extends Interface1 и T extends Interface2<Object>  -  Аргумент типа должен являться или реализовывать указанный интерфейс.
// Ограничивающий интерфейс также может быть универсальным.

class MyClass1<T extends Interface1> { /* ... */
}

class MyClass2<T extends Interface2<Object>> { /* ... */
}

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyClass1<Interface1> my1 = new MyClass1<Interface1>();
        MyClass1<Derived> my2 = new MyClass1<Derived>();

        MyClass2<Interface2<Object>> my3 = new MyClass2<Interface2<Object>>();
        MyClass2<Derived> my4 = new MyClass2<Derived>();
    }
}
