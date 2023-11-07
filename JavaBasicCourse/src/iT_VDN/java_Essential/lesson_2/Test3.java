package iT_VDN.java_Essential.lesson_2;

public class Test3 {
    Test3() {
        System.out.println("Constructor1");
    }

    Test3(int i){
        this();
        System.out.println("Constructor2");
    }

    public class Main{
        public static void main(String[] args) {
            Test3 test3 = new Test3(1);
        }
    }
}
