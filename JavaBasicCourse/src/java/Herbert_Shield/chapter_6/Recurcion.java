/**
 * Test
 *
 * @author Valentyn Mozul
 * @version 1.0 from 19.12.2022
 */

package java.Herbert_Shield.chapter_6;

class Recursion {

    String str;

    Recursion(String s) {
        str = s;
    }

    void recursion(int x) {
        if (x != str.length() - 1) recursion(x + 1);
        System.out.print(str.charAt(x));
    }
}

class RecursionDemo {
    public static void main(String[] args) {
        Recursion recursion = new Recursion("This is a test");
        recursion.recursion(0);
    }
}
