/**
 * java basic
 * lesson 4
 *
 * @version 1.0 from 2023-09-27
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_4.samples;

/**
 * Конкретный класс A.
 */
class ConcreteClassA2 {
    public void operation() {
        System.out.println("ConcreteClassA.operation");
    }
}

/**
 * Абстрактный класс.
 */
abstract class AbstractClass2 extends ConcreteClassA2 {
    public abstract void method();
}

/**
 * Конкретный класс B.
 */
class ConcreteClassB2 extends AbstractClass2 {
    @Override
    public void method() {
        System.out.println("ConcreteClassB.method");
    }
}


public class MainSamples_2 {
    public static void main(String[] args) {
        AbstractClass2 instance = new ConcreteClassB2();

       instance.method();
       instance.operation();
    }
}
