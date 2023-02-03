/**
 *
 * @author Valentyn Mozul
 * @version 1.0 from 31.01.2023
 */

package chapter_7;

public class Test {

    public static void main(String[] args) {
//        int res = 0;
//        int count = 3;
//
//        do {
//            count += 1;
//            res += count;
//        }while (count < 3);
//        System.out.println(res);


//        int a = 3;
//        int i;
//        for (i = 2; i <= a; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i);
//                if (i < (a - 1)) {
//                    System.out.print(",");
//                }
//            }
//        }

        int t = 5;
        for (int q = 0; q < t; q++) {
            int x = 0;
            while (x < t) {
                System.out.print("*");
                x++;
            }
            System.out.println();
        }
    }
}
