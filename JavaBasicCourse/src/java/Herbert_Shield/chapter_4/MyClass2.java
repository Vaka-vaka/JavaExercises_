/**
 * Parameterized constructor
 *
 * @author Valentyn Mozul
 * @version 1.0 from 28.09.2022
 */

package java.Herbert_Shield.chapter_4;

public class MyClass2 {
    int x;

    MyClass2(int i){
        x = i;
    }
}

class ParmConsDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyClass2 t1 = new MyClass2(12);
        MyClass2 t2 = new MyClass2(22);

        System.out.println(t1.x + " " + t2.x);
    }
}
