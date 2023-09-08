/**
 * Return an object of type String
 *
 * @author Valentyn Mozul
 * @version 1.0 from 17.11.2022
 */

package java.Herbert_Shield.chapter_6;

public class HelloMsg {
    String[] msg = {
            "Hello and bye",
            "I am fine, are you?",
            "I have three boys",
            "Kostya, Andrey, Zhenya"
    };

    String hello(int h) {
        if (h >= 0 & h < msg.length) {
            return msg[h];
        } else return "End andere!!!";
    }
}

class HelloMsgDemo {
    public static void main(String[] args) {
        HelloMsg helloMsg = new HelloMsg();
        String s1 = helloMsg.hello(0);
        String s2 = helloMsg.hello(1);
        String s3 = helloMsg.hello(2);
        String s4 = helloMsg.hello(3);
        String s5 = helloMsg.hello(4);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
