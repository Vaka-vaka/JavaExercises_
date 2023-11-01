package iT_VDN.java_Essential.lesson_2;

public class Test1 {
    final String s;

    public Test1() {
        s = "default";
    }

    public Test1(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        System.out.println(new Test1().s);
    }
}
