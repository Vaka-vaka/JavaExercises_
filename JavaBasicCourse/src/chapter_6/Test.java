/**
 * Test
 *
 * @author Valentyn Mozul
 * @version 1.0 from 15.12.2022
 */

package chapter_6;

public class Test {
    int a;

    Test(int i) {
        a = i;
    }

    int swap(int s) {
        return s + a;
    }
}

class TestDemo {
    public static void main(String[] args) {
        Test t = new Test(5);
        System.out.println(t.swap(5));
    }
}