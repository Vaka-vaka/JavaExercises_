/**
 * java basic
 * lesson 6
 *
 * @version 1.0 from 2023-10-09
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_6.homeWork_2;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Distance.Converter converter = new Distance.Converter();
        System.out.println("Centimeter to Meter " + converter.centimeterToMeter(10));
        System.out.println("Meter to Kylometer " + converter.meterToKylometri(10));
        System.out.println("Kylometr to Mili " + converter.kylometriToMili(10));
    }
}
