/**
 *
 * @author Valentyn Mozul
 * @version 1.0 from 31.01.2023
 */

package chapter_7;

public class Test {


    public static void main(String[] args) {
        int res = 0;
        int count = 3;

        do {
            count += 1;
            res += count;
        }while (count < 3);
        System.out.println(res);
    }
}
