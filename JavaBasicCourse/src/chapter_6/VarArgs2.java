/**
 * The use of the variable length argument array
 *  along with the usual arguments
 *
 * @author Valentyn Mozul
 * @version 1.0 from 09.12.2022
 */

package chapter_6;

public class VarArgs2 {
    //Здесь msg - обычный параметр, а v - массив параметров переменной длины
    static void vaTest(String msq, int... v) {
        System.out.println(msq + v.length);
        System.out.println("Содержимое : ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("arg " + i + " : " + v[i]);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(" Один аргумент в массиве : ", 10);
        vaTest(" Три аргумента в массиве : ", 1, 2, 3);
        vaTest("Отсутствуют аргументы в виде массива : ");
    }
}


