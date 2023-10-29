/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-10-12
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_7.enums.ex_004;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        // Объект со ссылкой на экземпляр перечисляемого типа Company.
        Company webcamp = Company.WEBCAMP;
        System.out.println(webcamp);

        // Вызов методов.
        int salary = webcamp.getValue();
        String currency = webcamp.getCurrency();
        System.out.println("Я зарабатываю " + salary + " " + currency + " в месяц");

        Company google = Company.GOOGLE;
        System.out.println(google);
        int salaryG = google.getValue();
        String currencyG = google.getCurrency();
        System.out.println("Я зарабатываю " + salaryG + " " + currencyG + " в месяц");

        Company skynet = Company.SKYNET;
        System.out.println(skynet);
    }
}
