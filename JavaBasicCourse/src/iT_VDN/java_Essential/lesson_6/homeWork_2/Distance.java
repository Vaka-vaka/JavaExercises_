/**
 * java basic
 * lesson 6
 *
 * @version 1.0 from 2023-10-09
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_6.homeWork_2;

public class Distance {
    double distance;

    void print() {
        System.out.println("Distance ");
    }

    static class Converter {

        public double centimeterToMeter(double cent) {
            return cent / 100;
        }

        public double meterToKylometri(double meter) {
            return meter / 1000;
        }

        public double kylometriToMili(double km) {
            return km / 1.609344;
        }
    }
}
