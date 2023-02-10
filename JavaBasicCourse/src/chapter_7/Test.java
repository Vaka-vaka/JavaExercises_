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

//        System.out.println("Введіть розмір трикутника1");
//        Scanner scanner1 = new Scanner(System.in);
//        int size1 = scanner1.nextInt();
//        for(int i = size1; i > 0; i--){
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

//        System.out.println("Введіть розмір трикутника");
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//
//        for(int i = 1; i <= size; i++){
//           for (int y = 0; y < i; y++){
//               System.out.print("*");
//           }
//            System.out.println();
//        }

//        System.out.println("Введіть розмір трикутника");//ялинка
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        int t = 0;
//        for (int i = size; i > 0; i--) {
//            for (int y = 0; y < i; y++){
//                System.out.print(" ");
//            }
//            for (int a = 0; a <= t * 2; a++){
//                System.out.print("*");
//            }
//            System.out.println();
//            t++;
//        }

//        System.out.println("Введіть розмір трикутника");
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        int t = 0;
//        for (int i = size; i > 0; i--) {
//            for (int y = 0; y < i; y++){
//                System.out.print(" ");
//            }
//            for (int a = 0; a <= t; a++){
//                System.out.print("*");
//            }
//            System.out.println();
//            t++;
//        }

//        System.out.println("Введіть розмір трикутника");
//        Scanner scanner1 = new Scanner(System.in);
//        int size1 = scanner1.nextInt();
//        int t1 = 0;
//        for (int i = size1; i > 0; i--) {
//
//            for (int a = 0; a <= t1; a++){
//                System.out.print(" ");
//            }
//            for (int y = 0; y < i; y++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//            t1++;
//        }
//        int a = 5;
//        int b = 1;
//        int c = 0;
//
//        if (a <= b) {
//            while (a <= b) {
//                // c +=a; and
//                c = c + a;
//                a++;
//            }
//            System.out.println("sum " + c);
//        }else {
//            while (b <= a) {
//                // c +=a; and
//                c = c + b;
//                b++;
//            }
//            System.out.println("sum " + c);
//        }

//        int a = 5;
//        int b = 1;
//
//        if(a > b){
//            int c = b;
//            b = a;
//            a = c;
//        }
//
//        int d = 0;
//        while (a <= b){
//            d += a++;
//        }
//        System.out.println(d);

//        int[] array = new int[11];
//        int a = 0;
//
//        while (a < 11){
//            array[a] = a;
//            a++;
//        }
//
//        a = 0;
//        while (a < 11){
//            System.out.println(array[a]);
//            a++;
//        }
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 8;
        int e = 5;
        int f = 6;
        int max = 0;

        if (a < b) {
            max = b;
        }if (b < c) {
            max = c;
        }if (c < d) {
            max = d;
        }if (d < e) {
            max = e;
        }if (e < f) {
            max = f;
        }
        System.out.println(max);
    }
}
