package iT_VDN;

public class Test {
    public void method() {
        System.out.println("Class MyClass: method()");
    }
    public int getNumber() {
        return 0;
    }
}
class Q5 {
    public static void main(String[] args) {
        Test instance = new Test() {
            public static int number = 0;
            @Override
            public void method() {
                number += 3;
            }
            public int getNumber() {
                return number;
            }
        };
        instance.method();
        instance.method();
        System.out.println(instance.getNumber());
    }
}

