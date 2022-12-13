/**
 * Overloading a method with a variable number of arguments
 *
 * @author Valentyn Mozul
 * @version 1.0 from 09.12.2022
 */

package chapter_6;

public class VarArgs3 {
    // Первая версия метода vaTest()
    static void vaTest(int... v) {
        System.out.println("vaTest (int ...): "
                + " Количество аргументов : "
                + v.length);
        System.out.println("Coдepжимoe: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("arg " + i + " : " + v[i]);

            System.out.println();
        }
    }

    // Вторая версия метода vaTest()
    static void vaTest(boolean... v) {
        System.out.println("vaTest (boolean) : "
                + "Количество аргументов : "
                + v.length
                + "\nCoдepжимoe : ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("art " + i + " : " + v[i]);

            System.out.println();
        }
    }

    // Третья версия метода vаТеst()
    static void vaTest(String msq, int... v) {
        System.out.println("vaTest (String, int ... ) : " + msq + v.length);
        System.out.println("Coдepжимoe : ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("art " + i + " : " + v[i]);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Тестирование : ", 10, 20);
        vaTest(true, false, false);
    }
}
