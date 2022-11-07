/**
 * Using a bitwise exclusive OR operation
 * to encrypt and decrypt messages
 *
 * @author Valentyn Mozul
 * @version 1.0 from 06.11.2022
 */

package chapter_5;

public class Encode2 {
    public static void main(String[] args) {
        String s = "Это просто тест";
        String s1 = "";
        String s2 = "";
        int keey = 88;

        System.out.println("Иcxoднoe сообщение : ");
        System.out.println(s);

        for (int i = 0; i < s.length(); i++) {
            s1 = s1 + (char) (s.charAt(i) ^ keey);
        }
        System.out.println("Зaшифpoвaннoe сообщение :");
        System.out.println(s1);

        for (int i = 0; i < s.length(); i++) {
            s2 = s2 + (char) (s1.charAt(i) ^ keey);
        }
        System.out.println("Дешифрованное сообщение : ");
        System.out.println(s2);
    }
}
