package iT_VDN.java_Essential.lesson_3.test;

public class B extends A {
    int i = 10;

    public B(int i, int i1) {
        super(i);
        this.i = i1;
    }

    public int increment() {
        return ++i;
    }

    public static void main(String[] args) {
//        A obj = (A) new B();
//        System.out.println(obj.increment());
    }
}
