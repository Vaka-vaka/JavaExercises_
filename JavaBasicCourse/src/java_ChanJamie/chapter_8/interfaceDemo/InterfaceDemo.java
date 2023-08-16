/**
 * demo interface
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.07.2023
 */

package java_ChanJamie.chapter_8.interfaceDemo;

public class InterfaceDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyClass a = new MyClass();
        a.someMethod();
        System.out.println("The value of the constant is " + MyInterface.myInt);

        a.someDefoultMethod();
        MyInterface.someStaticMethod();
    }
}
