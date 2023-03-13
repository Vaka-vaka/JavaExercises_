/**
 *
 * @author Valentyn Mozul
 * @version 1.0 from 07.02.2023
 */

package primitiveTypes;

public class BitOperation {

    public static void main(String[] args) {
        /* x ~ */      /*Оператор NOT ~*/ // ~a, приорітет 3
        /* 0 1 */
        int var = 121; //двоичный вид     00000000 00000000 00000000 01111001
        /* 1 0 */
        int not_var = ~var; // результат 11111111 11111111 11111111 10000110 (-122)
        System.out.println(not_var);

        /*Оператор AND &*/ //a = a & b, a&=b, приорітет 2
        /*  x y & */
        byte flags = 5; // двоичный вид 00000101
        /*  0 0 0 */
        byte mask = 4; // двоичный вид  00000100
        /*  0 1 0 */
        int resul = flags & mask;//     00000100
        /*  1 0 0 */
        System.out.println(resul);
        /*  1 1 1 */
        flags = (byte) (flags & ~mask);
        System.out.println(flags);

        /*Оператор OR |*/ //a = a | b, a|=b, приорітет 1
        /*  x y & */
        byte flags_ = 8; // двоичный вид 00001000
        /*  0 0 0 */
        byte mask_ = 5; // двоичный вид  00000101
        /*  0 1 1 */
        flags_ = (byte) (flags_ | mask_);// 00001100 (number 13)
        /*  1 0 1 */
        System.out.println(flags_);
        /*  1 1 1 */


        /*Оператор XOR ^*/ //a = a ^ b, a^=b, приорітет 1
        /*  x y & */
        byte flags_xor = 9;         // двоичный вид 00001001
        /*  0 0 0 */
        byte mask_xor = 1;         // двоичный вид  00000001
        /*  0 1 1 */
        flags_xor = (byte) (flags_xor ^ mask_xor);// 00001000 (number 8)
        /*  1 0 1 */
        System.out.println(flags_xor);
        /*  1 1 0 */
        flags_xor ^= mask_xor;
        System.out.println(flags_xor);
    }
}
