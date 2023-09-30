package iT_VDN.java_Essential.lesson_3.test;

public class AK {
    public void m(int k) {
        System.out.println("class A, method m: " + ++k);
    }
}

class BK extends AK {
    public void m(int k) {
        System.out.println("class B, method m: " + k++);
    }
}

