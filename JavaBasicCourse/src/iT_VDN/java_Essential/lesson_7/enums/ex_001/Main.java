/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-10-12
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_7.enums.ex_001;

enum DAY {
    MONDAY, TEUSDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        // Объект со ссылкой на экземпляр перечисляемого типа Day.
        DAY today = DAY.SATURDAY;
        System.out.println(today);

        int number = 4;
        // Нельзя присвоить значение целого типа.
        //today = number;
        //today = 4;
    }
}
