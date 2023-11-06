package iT_VDN.java_Essential.lesson_2;

public class Test4 {
    public Test4(){}

    public Test4(int i){
        this(i, i);
    }

    public Test4(int i, int y) {
        this();
    }

    public static void main(String[] args) {
        Test4 t = new Test4(2, 3);
    }
}
