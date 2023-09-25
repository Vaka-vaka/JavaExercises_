/**
 * Demonstration of the use of the method
 * with a variable number of arguments
 *
 * @author Valentyn Mozul
 * @version 1.0 from 08.12.2022
 */

package java.Herbert_Shield.chapter_6;

public class VarArgs {
    //Метод vaTest() допускает переменное число аргументов
    static void vaTest(int... v) {
        System.out.println("Koличecтвo аргументов : " + v.length);
        System.out.println("Coдepжимoe : ");

        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + " : " + v[i]);

        System.out.println();
    }

    public static void main(String[] args) {
        // Метод vaTest() может вызываться с переменным числом аргументов
        vaTest(10); //1 аргумент
        vaTest();       // без аргументов
        vaTest(3, 4, 5); // 3 аргумента
    }
}
