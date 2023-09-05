/**
 * Using a bitwise exclusive OR operation
 * to encrypt and decrypt messages
 *
 * @author Valentyn Mozul
 * @version 1.0 from 05.11.2022
 */

package java.Herbert_Shield.chapter_5;

public class Encode {
    String encmsg = "";
    String decmsg = "";
    int key = 88;

    // Шифрование сообщения
    String encode() {
        for (int i = 0; i < "Это просто тест".length(); i++) {
            encmsg = encmsg + (char) ("Это просто тест".charAt(i) ^ key);
        }
        return encmsg;
    }

    // Дешифровка сообщения
    String decode(String dec) {
        for (int i = 0; i < dec.length(); i++) {
            decmsg = decmsg + (char) (dec.charAt(i) ^ key);
        }
        return decmsg;
    }

    static class DemEncode {
        /**
         * Program entry point.
         *
         * @param args command Line arguments
         */
        public static void main(String[] args) {
            System.out.println("Иcxoднoe сообщение : ");
            System.out.println("Это просто тест");

            Encode encodeD = new Encode();
            String str = encodeD.encode();
            System.out.println("Зaшифpoвaннoe сообщение :");
            System.out.println(str);

            String str1 = encodeD.decode(str);
            System.out.println("Дешифрованное сообщение : ");
            System.out.println(str1);
        }
    }
}
