package iT_VDN.java_Essential.lesson_8;

public class Test {
    public static void main(String[] args) {
        try {
            foo();
            System.out.print("A ");
        } catch (Exception e) {
            System.out.print("B ");
        } finally {
            System.out.print("C ");
        }
    }

    private static void foo() throws Exception {
        try {
            System.out.print("A1 ");
            throw new Exception();
        } catch (Exception e) {
            System.out.print("B1 ");
            throw new Exception();
        } finally {
            System.out.print("C1 ");
        }
    }
}


