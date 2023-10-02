package iT_VDN.java_Essential.lesson_3.test;
 class A1 {

    private static void test1() {
        System.out.println("A.test1");
    }

    static void test2() {
        test1();
    }
}

public class BA1 extends A1 {
    void test1() {
        System.out.println("B1.test1");
    }

    static void test2() {
     //   super.test2();  помилка
    }

    public static void main(String[] args) {
        A1 a1 = new BA1();
        a1.test2();
    }
}
