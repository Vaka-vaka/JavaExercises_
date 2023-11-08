package iT_VDN.java_Essential.lesson_8;

public class Test2 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
            System.out.print("All correct");
//        } catch (Exception e) {
//            System.out.print("Exception");
        } catch (ArithmeticException e) {
            System.out.print("ArithmeticException");
        }
    }
}
