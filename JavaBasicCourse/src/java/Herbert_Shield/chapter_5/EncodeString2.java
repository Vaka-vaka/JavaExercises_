/**
 * Using a bitwise exclusive OR operation
 * to encrypt and decrypt messages
 *
 * @author Valentyn Mozul
 * @version 1.0 from 11.11.2022
 */

package java.Herbert_Shield.chapter_5;

import java.util.Scanner;

public class EncodeString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = scanner.nextLine();
        String encode = "";
        String decode = "";
        String keyStr = "abcdefgi";
        int x = 0;

        System.out.print("Исходное сообщение: ");
        System.out.println(str);

        // шифрование сообщения
        for (int i = 0; i < str.length(); i++) {
            encode = encode + (char) (str.charAt(i) ^ keyStr.charAt(x));
            x++;
            if (x == 8){
                x = 0;
            }
        }
        System.out.print("Зашифрованное сообщение: ");
        System.out.println (encode);

        // дешифровка сообщения
        x = 0;
        for (int i = 0; i < str.length (); i++) {
            // построение дешифрованной строки сообщения
            decode = decode + (char) (encode.charAt (i) ^ keyStr.charAt (x));
            x++;
            if (x == 8){
                x = 0;
            }
        }
        System.out.print("Дешифрованное сообщение: ");
        System.out.println (decode);
    }
}
