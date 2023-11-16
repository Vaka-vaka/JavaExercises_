package iT_VDN.java_Essential.lesson_9.tests;

public class B extends A {
    public void job(int i) {
        System.out.println("Class B");
    }

    public static void main(String[] args) {
        B b = new B();
        b.job();
    }
}
