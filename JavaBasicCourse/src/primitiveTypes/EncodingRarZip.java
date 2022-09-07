package primitiveTypes;

public class EncodingRarZip {

    public static void main(String[] args) {
        String msg = "Привіт світ!";
        byte key = 111;
        System.out.println(msg);

        char[] str = msg.toCharArray();
        for(int i = 0; i < msg.length(); ++i)
            str[i] ^= key;
        msg = new String(str);
        System.out.println(msg);


        for(int i = 0; i < msg.length(); ++i)
            str[i] ^= key;
        msg = new String(str);
        System.out.println(msg);
    }
}
