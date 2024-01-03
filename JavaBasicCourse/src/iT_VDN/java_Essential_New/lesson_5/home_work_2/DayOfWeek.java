/**
 * java basic
 * lesson 5
 *
 * @version 1.0 from 2023-12-13
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_5.home_work_2;

public enum DayOfWeek {
    MONDAY("Понеділок"),
    TUESDAY("Вівторок"),
    WEDNESDAY("Середа"),
    THURSDAY("Четвер"),
    FRIDAY("П'ятниця"),
    SATURDAY("Субота"),
    SUNDAY("Неділля");

    private final String name;


    DayOfWeek(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void isWeekend(String dayOfWeek) {
        if (dayOfWeek.equals(SATURDAY.getName()) || dayOfWeek.equals(SUNDAY.getName())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
