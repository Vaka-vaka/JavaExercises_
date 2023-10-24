/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-10-12
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_7.enums.ex_002;

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
        // Нельзя переопределить єкземпляр перечисляемого типа.
        //Day.MONDAY = Day.FRIDAY;
        DAY today = DAY.FRIDAY;
        switch (today) {
            case SATURDAY:
                System.out.println("First day of the weekend - Saturday.");
                break;
            case SUNDAY:
                System.out.println("The last day of the weekend - Sunday.");
                break;
            default:
                System.out.println("The weekday " + today);
        }

        if (today == DAY.SATURDAY) {
            System.out.println("Finally, weekend");
        }
    }
}
