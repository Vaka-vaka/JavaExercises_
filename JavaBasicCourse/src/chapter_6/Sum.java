/**
 * Создайте метод sum () с аргументами переменной длины для
 * суммирования передаваемых ему значений типа int.
 * Метод должен возвращать результат суммирования.
 *
 * @author Valentyn Mozul
 * @version 1.0 from 19.12.2022
 */

package chapter_6;

class Sum {
    int res;

    int sum1(int... a) {

        for (int j : a) {
            res += j;
        }
        return res;
    }
}

class SumDemo {
    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.sum1(4, 5, 1));
        System.out.println();
        System.out.println(sum.sum1(1, 2, 3));
    }
}
