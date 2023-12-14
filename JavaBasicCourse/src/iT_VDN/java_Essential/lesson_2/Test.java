package iT_VDN.java_Essential.lesson_2;

public class Test {
    private String book;
    public void setBook (String b) {
        book = b;
    }
}

class TestDemo {
    public static void main (String [] args) {
        Test book1 = new Test (); book1.setBook ("Java 7");
        Test book2 = new Test (); book2.setBook ("Java 7");
        if (book1.equals (book2)) {
            System.out.println ("True");
        } else {
            System.out.println ("False");
        }
    }
}
