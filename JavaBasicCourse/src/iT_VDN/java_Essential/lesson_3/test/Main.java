package iT_VDN.java_Essential.lesson_3.test;
 class One {
    public static int j = 10;

    One() {
        j = 20;
    }
}

public class Main extends One {
    public static void main(String[] args) {
        new MainIncrement();
        System.out.println(One.j);
    }
}
