package primitiveTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Invert {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите a: ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Введите b: ");
        int b = Integer.parseInt(br.readLine());

        System.out.println(Invert.flipBit(a,b));
    }

    public static int flipBit(int value, int bitIndex) {
        int bit = 1 << bitIndex - 1;
        System.out.println("Бит = " + bit);
        return value ^ bitIndex;// put your implementation here
    }

}
