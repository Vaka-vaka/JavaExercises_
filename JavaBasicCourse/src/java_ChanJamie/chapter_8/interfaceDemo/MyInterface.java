/**
 * demo interface
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.07.2023
 */

package java_ChanJamie.chapter_8.interfaceDemo;

public interface MyInterface {
    int myInt = 5;

    void someMethod();

    public static void someStaticMethod() {
        System.out.println("This is a static method in an interface");
    }

    public default void someDefoultMethod() {
        System.out.println("This is a default method in an interface");
    }
}
