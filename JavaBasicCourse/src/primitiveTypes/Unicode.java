package primitiveTypes;

public class Unicode {

    public static char charExpression(int a) {
        char ch = '\\';
        /*char x = (char) (ch + a);*/
        // или
        ch += a;
        return ch;
    }

    public static void main(String[] args) {

       /* char c = '^';
        int u = (int) c;
        System.out.println(u);
        char ch, ch_a, ch_d ;
        int b = 92;                     // Представление символа Х в коде ASCI I
        int a = 93;
        int d = 94;
        ch = ( char) b ;            //  Явное приведение несовместимых типов
        ch_a = ( char) a ;
        ch_d = ( char) d ;
        System.out.println("ch: " + ch);
        System.out.println("ch_a: " + ch_a);
        System.out.println("ch_d: " + ch_d);*/
        System.out.println(charExpression(1));
    }
}
