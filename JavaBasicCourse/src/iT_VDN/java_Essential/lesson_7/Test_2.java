package iT_VDN.java_Essential.lesson_7;

enum Numbers {ONE, TWO, THREE, FOUR, FIVE}
public class Test_2 {
    public static void main(String[] args) {
        Numbers n1 = Numbers.ONE;
        Numbers n2 = Numbers.ONE;
        if (n1 == n2) {
            System.out.print("true");
        }else {
            System.out.print("false");
        }
        System.out.println(Numbers.FIVE.ordinal());
    }
}
