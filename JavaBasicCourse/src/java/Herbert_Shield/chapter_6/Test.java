/**
 * Test
 *
 * @author Valentyn Mozul
 * @version 1.0 from 15.12.2022
 */

package java.Herbert_Shield.chapter_6;
 public class Test {
    int a;

    Test(int i) {
        a = i;
    }

    void swap(Test ob) {
        ob.a = ob.a + a;
    }

    void swap(Test st1, Test st2){
         int x;
         x = st1.a;
          st1.a = st2.a;
          st2.a = x;
    }
}

class TestDemo {
    public static void main(String[] args) {
        Test t = new Test(5);
        Test t2 = new Test(4);
        System.out.println("t = " + t.a);
        System.out.println("t2 = " + t2.a);
        t.swap(t);
        System.out.println("Go t = " + t.a);
        t2.swap(t2);
        System.out.println("Go t2 = " + t2.a);
        System.out.println("Swap t and t2 \n" + t.a + " and " +  t2.a);
        t.swap(t,t2);
        System.out.println("Swap t and t2 \n" + t.a + " and " +  t2.a);
    }
}