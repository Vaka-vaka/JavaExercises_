package iT_VDN.java_Essential.lesson_8.tryCatch;

public class Test {
    private int qQ;

    public Test(int q) {
        qQ = 12 / q;  //1
    }

    public int getQQ() {
        return qQ;  //2
    }

    public static void main(String[] args) {
        Test quest = null;
        try {
            quest = new Test(0);  //3
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(quest.getQQ());  //4
    }
}
