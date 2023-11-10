package iT_VDN.java_Essential.lesson_3.test;

public class MainDemo {
    public static void main(String[] args) {
        Base sub = new Sub();
        sub.testT();
        Sub sub1 = new Sub();
        sub1.testT();
    }
}

class Base {
    public static void testT() {
        System.out.println("Base.testT");
    }
}

class Sub extends Base {
    public static void testT() {
        System.out.println("Sub.testT");
    }
}
