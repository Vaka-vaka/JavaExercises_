/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-10-12
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_7.enums.ex_003;

enum Company {
    WEBCAMP(1000), GOOGLE(100), SKYNET(10); //, TEST, TEST2(1000, "string"); // - Error
    int value;

    // Конструктор может быть только private.
    Company(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Company myCompany = Company.WEBCAMP;
        System.out.println(
                "Я работаю в компании " + myCompany + " и зарабатываю " + myCompany.getValue() + "$ в месяц.");
    }
}
