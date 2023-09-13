/**
 * Simple Designer
 *
 * @author Valentyn Mozul
 * @version 1.0 from 28.09.2022
 */

package java.Herbert_Shield.chapter_4;

public class MyClass {
    int x;

    MyClass(){
        x = 10;
    }
}

class ConsDemo{
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
    MyClass t1 = new MyClass();
    MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);
    }
}
