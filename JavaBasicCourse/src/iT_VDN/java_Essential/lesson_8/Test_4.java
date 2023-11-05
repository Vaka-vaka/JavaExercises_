package iT_VDN.java_Essential.lesson_8;

public class Test_4 {
    private int qQ;
    public Test_4(int q) {
        qQ = 12 / q;  //1
    }
    public int getQQ() {
        return qQ;  //2
    }
    public static void main(String[] args) {
        Test_4 quest = null;
        try {
            quest = new Test_4(0);  //3
        } catch (Exception e) {
        }
        System.out.println(quest.getQQ());  //4
    }
}
