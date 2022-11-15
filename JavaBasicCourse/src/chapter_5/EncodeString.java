/**
 * Using a bitwise exclusive OR operation
 * to encrypt and decrypt messages
 *
 * @author Valentyn Mozul
 * @version 1.0 from 10.11.2022
 */

package chapter_5;

public class EncodeString {
    String encode = "";
    String decode = "";
    String keyStr = "IamVakun";
    int x = 0;
    int y = 0;

    // Шифрование сообщения
    String encode(String s) {
        for (int i = 0; i < s.length(); i++) {
            encode = encode + (char) (s.charAt(i) ^ keyStr.charAt(x));
            x++;
            if (x == 8){
                x = 0;
            }
        }
        return encode;
    }
    // Дешифровка сообщения
    String dencode(String ss){
        for (int i = 0; i < ss.length(); i++){
            decode = decode + (char) (ss.charAt(i) ^ keyStr.charAt(y));
            y++;
            if (y == 8){
                y = 0;
            }
        }
        return decode;
    }
}

class EncodeDemo {
    public static void main(String[] args) {
        System.out.println("Иcxoднoe сообщение : ");
        System.out.println("Это просто тест");

        EncodeString encodeString = new EncodeString();
        String string = encodeString.encode("Это просто тест");
        System.out.println(string);

        EncodeString encodeString1 = new EncodeString();
        String str = encodeString1.dencode(string);
        System.out.println(str);
    }
}
