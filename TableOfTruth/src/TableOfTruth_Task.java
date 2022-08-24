/**
 * A program that prints <code>TableOfTruth</code>
 *
 * @author Valentyn Mozul
 * @version 1.1
 */

public class TableOfTruth_Task {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        System.out.println("Таблица истинности | и !=");
        if((true | true) == (true != true)) {
            System.out.println("Верно");
        } else {
            System.out.println("Не верно");
        }
         if((true | false) == (true | false)) {
            System.out.println("Верно");
         } else {
            System.out.println("Не верно");
         }
          if((false | true) == (false | true)) {
            System.out.println("Верно");
          } else {
            System.out.println("Не верно");
          }
           if((false | false) == (false | false)) {
            System.out.println("Верно");
           } else {
            System.out.println("Не верно");
           }
        /* System.out.println("================ ИЛИ ТАК =================");
        System.out.println("Таблица истинности | и !=");
        System.out.println((true | true) + " и " + (true != true));
        System.out.println((true | false) + " и " + (true != false));
        System.out.println((false | true) + " и " + (false != true));
        System.out.println((false | false) + " и " + (false != false));
        System.out.println("========================================");
        System.out.println("Таблица истинности ^ и !=");
        System.out.println((true ^ true) + " и " + (true != true));
        System.out.println((true ^ false) + " и " + (true != false));
        System.out.println((false ^ true) + " и " + (false != true));
        System.out.println((false ^ false) + " и " + (false != false));
        System.out.println("========================================");
        System.out.println("Таблица истинности | и ||");
        System.out.println((true | true) + " и " + (true || true));
        System.out.println((true | false) + " и " + (true || false));
        System.out.println((false | true) + " и " + (false || true));
        System.out.println((false | false) + " и " + (false || false));
        System.out.println("========================================");
        System.out.println("Таблица истинности & и ==");
        System.out.println((true & true) + " и " + (true == true));
        System.out.println((true & false) + " и " + (true == false));
        System.out.println((false & true) + " и " + (false == true));
        System.out.println((false & false) + " и " + (false == false));*/

        boolean[] a = {false, false, true, true};
        boolean[] b = {false, true, false, true};

        System.out.println("Таблица истинности для | :");
        for (int i = 0; i < 4; i++) {
            System.out.println(a[i] + " " + b[i] + " | " + (a[i] | b[i]));
        }

        System.out.println("Таблица истинности для || :");
        for (int i = 0; i < 4; i++) {
            System.out.println(a[i] + " " + b[i] + " | " + (a[i] || b[i]));
        }

        System.out.println("Таблица истинности для != :");
        for (int i = 0; i < 4; i++) {
            System.out.println(a[i] + " " + b[i] + " | " + (a[i] != b[i]));
        }

        System.out.println("Таблица истинности для ^ :");
        for (int i = 0; i < 4; i++) {
            System.out.println(a[i] + " " + b[i] + " | " + (a[i] ^ b[i]));
        }

        System.out.println("Таблица истинности для & :");
        for (int i = 0; i < 4; i++) {
            System.out.println(a[i] + " " + b[i] + " | " + (a[i] & b[i]));
        }

        System.out.println("Таблица истинности для == :");
        for (int i = 0; i < 4; i++) {
            System.out.println(a[i] + " " + b[i] + " | " + (a[i] == b[i]));
        }
    }
}
