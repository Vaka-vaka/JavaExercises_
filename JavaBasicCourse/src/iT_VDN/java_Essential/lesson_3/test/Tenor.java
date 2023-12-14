package iT_VDN.java_Essential.lesson_3.test;

public class Tenor extends Singer {
    public static String sing() {
        return "fa";
    }

    public static void main(String[] args) {
        Tenor tenor = new Tenor();
        Singer singer = new Tenor();
        System.out.println(tenor.sing() + " " + singer.sing());
    }
}
