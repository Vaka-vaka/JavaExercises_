/**
 *
 * @author Valentyn Mozul
 * @version 1.0 from 31.01.2023
 */

package chapter_7;

import java.util.Scanner;

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

//        int t = 5;
//        for (int q = 0; q < t; q++) {
//            int x = 0;
//            while (x < t) {
//                System.out.print("*");
//                x++;
//            }
//            System.out.println();
//        }
//
//        int a = 4;
//        for (int i = 0; i < a; i++) {
//            int y = a - i;
//            for(int x = 0; x < y; x++)
//                System.out.print("*");
//                System.out.println();
//        }

//        System.out.println("Введіть розмір трикутника");
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        for(int i = size; i > 0; i--){
//            for(int y = 0; y < i; y++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println("Введіть розмір трикутника");
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//
//        int i;
//        i = size;
//        while (i > 0) {
//            int y;
//            y = 0;
//            while (y < i){
//                System.out.print("*");
//                y++;
//            }
//            System.out.println();
//            i--;
//        }

        System.out.println("Введіть розмір трикутника");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for(int i = 1; i <= size; i++){
           for (int y = 0; y < i; y++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
