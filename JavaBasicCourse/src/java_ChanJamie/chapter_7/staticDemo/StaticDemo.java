/**
 * static class demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 13.07.2023
 */

package java_ChanJamie.chapter_7.staticDemo;

public class StaticDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyClass sd = new MyClass();
        System.out.println(sd.getMessage());
        sd.setMessage("food");
        sd.displayMessage();


        System.out.println(MyClass.getGreetings());
        MyClass.displayGreetings();
    }
}
