/**
 * demo modifier
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.07.2023
 */

package java_ChanJamie.chapter_8.modifierDemo;

public class ClassesInSamePackage {}

class ClassA extends ModifierDemo {
    public void printMessages() {
        System.out.println(publicNum);

        System.out.println(protectedNum);

        System.out.println(packagePrivateNum);

        // не можна
        System.out.println("privateNum stop");
    }
}

class ClassB {
    public void printMessages() {
        ModifierDemo p = new ModifierDemo();

        System.out.println(p.publicNum);

        System.out.println(p.protectedNum);

        System.out.println(p.packagePrivateNum);

        // не можна
        System.out.println("p.privateNum stop");
    }
}
