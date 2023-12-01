/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-10
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.generic.ex_009;

interface Interface1 { /* ... */
}

interface Interface2<U> extends Interface1 { /* ... */
}

class Derived implements Interface1, Interface2<Object> { /* ... */
}

class Derived2 implements Interface2<Object> { /* ... */
}

// where T : Interface, Interface<object>  -  Аргумент типа должен являться или реализовывать указанный интерфейс.
// Можно установить несколько ограничений интерфейса. Ограничивающий интерфейс также может быть универсальным.

class MyClass<T extends Interface1> { /* ... */
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
        //  Аргумент типа подходит, т.к., Interface<object> наследуется от Interface
        MyClass<Interface2<Object>> my1 = new MyClass<>();
        MyClass2<Derived> my2 = new MyClass2<>();
        MyClass2<Derived2> my3 = new MyClass2<>();
        MyClass2<Interface2<Object>> my4 = new MyClass2<>();
    }
}
