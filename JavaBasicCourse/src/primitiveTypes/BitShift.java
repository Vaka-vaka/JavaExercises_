package primitiveTypes;

public class BitShift {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int x = 160; // 10100000
        System.out.println(">> " + x);
        x = x >> 1; // 01010000 (number 80)
        System.out.println(">> " + x);
        x = x >> 1; // 00101000 (number 40)
        System.out.println(">> " + x);
        x = x >> 1; // 00010100 (number 20)
        System.out.println(">> " + x);
        x = x >> 1; // 00001010 (number 10)
        System.out.println(">> " + x);
        x = x >> 1; // 00000101 (number 5)
        System.out.println(">> " + x);
        x = x >> 1; // 00000010 (number 2)
        System.out.println(">> " + x);
        x = x >> 1; // 00000001 (number 1)
        System.out.println(">> " + x);


        int y = 5;
        y = y << 1;

        byte z = 5;
        z = (byte) (z << 1);
        System.out.println("<< " + y);
        System.out.println("<< " + z);
    }
}
