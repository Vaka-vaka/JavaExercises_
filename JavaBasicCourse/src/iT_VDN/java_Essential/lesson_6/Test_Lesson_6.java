package iT_VDN.java_Essential.lesson_6;

public class Test_Lesson_6 {

    static int km;

    public static void main(String[] args) {
        Test_Lesson_6 test_lesson_6 = new Test_Lesson_6();
        test_lesson_6.km = 100;

        Test_Lesson_6 test_lesson_61 = new Test_Lesson_6();
        test_lesson_61.km = 85;

        System.out.println("Orange car - " + test_lesson_6.km);
        System.out.println("Blue car - " + test_lesson_61.km);
    }
}

