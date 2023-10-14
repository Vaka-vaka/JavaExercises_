package iT_VDN.java_Essential.lesson_3.test;

public class Funcs {
    public int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        Funcs f = new Funcs();
        System.out.println("" + f.add(1, 2));
    }
}
