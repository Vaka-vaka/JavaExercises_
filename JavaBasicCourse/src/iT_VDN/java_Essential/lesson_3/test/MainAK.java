package iT_VDN.java_Essential.lesson_3.test;

public class MainAK {
    public static void main(String[] args) {
        AK ak = (AK) new BK();
        ak.m(34);

        AK ak1 = new BK();
        ak1.m(32);

        AK ak2 = new AK();
        ak2.m(55);
        BK bk = new BK();
        bk.m(56);
    }
}
