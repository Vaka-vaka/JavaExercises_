/**
 * java basic
 * lesson 5
 *
 * @version 1.0 from 2023-12-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_5.lesson5;

public enum Seasons {
    SPRING("Весна"),
    SUMMER("Літо"),
    AUTUMN("Осінь"),
    WINTER("Зима");

    private final String name;

    Seasons(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
