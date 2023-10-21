package iT_VDN.java_Essential.lesson_3.test;

public class MainIncrement extends Increment {
    int i = 1;

    public int increment() {
        return ++i;
    }

    public static void main(String[] args) {
        MainIncrement b = (MainIncrement) new Increment();
        System.out.println(b.increment());
    }
}
