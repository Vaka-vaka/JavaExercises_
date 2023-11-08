package java_ChanJamie.chapter_12;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        boolean bool;

        try {
            File f = new File("members.csv");
            File tf = new File("members.temp");

            bool = tf.renameTo(f);
            System.out.println(bool);
           // f.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
