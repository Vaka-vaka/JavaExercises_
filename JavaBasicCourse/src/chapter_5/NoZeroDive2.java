/**
 * Предотвраще ние деления на нуль с помощью оператора ?
 *
 * @author Valentyn Mozul
 * @version 1.0 from 08.11.2022
 */

package chapter_5;

public class NoZeroDive2 {
    public static void main(String[] args) {

        for (int i = -5; i < 6; i++){
            if (i != 0 ? true : false);
            System.out.println("100 / " + i + " равно " + 100 / i);
        }
    }
}
