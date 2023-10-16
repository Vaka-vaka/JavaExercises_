/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-09-04
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_2;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        double areaS = MyArea.getAreaOfCircle(25);
        System.out.println(areaS);
        System.out.println("*************************************");

        System.out.println("Auto");
        Auto auto = new Auto();
        Auto auto1 = new Auto(2005);
        Auto auto2 = new Auto(2017, "Green");
        System.out.println(auto.getColor() + auto.getYear());
        System.out.println(auto1.getYear() + auto1.getColor());
        System.out.println(auto2.getYear() + auto2.getColor());
        System.out.println("************************************");

        System.out.println("Auto1");
        Auto1 auto11 = new Auto1(2017);
        Auto1 auto12 = new Auto1(2017, 170.0);
        Auto1 auto13 = new Auto1(2017, 170.0, 1500);
        Auto1 auto14 = new Auto1(2017, 170.0, 1500, "white");
        System.out.println(auto11.getYear());
        System.out.println(auto12.getYear() + " " + auto12.getSpeed());
        System.out.println(auto13.getYear() + " " + auto13.getSpeed() + " " + auto13.getWeight());
        System.out.println(auto14.getYear() + " " + auto14.getSpeed() + " " + auto14.getWeight() + " " + auto14.getColor());
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        System.out.println("Auto2");
        Auto1 auto111 = new Auto1(2017);
        Auto1 auto121 = new Auto1(2018, 130.0);
        Auto1 auto131 = new Auto1(2019, 140.0, 1500);
        Auto1 auto141 = new Auto1(2020, 150.0, 1700, "white");
        System.out.println(auto111.getYear());
        System.out.println(auto121.getYear() + " " + auto121.getSpeed());
        System.out.println(auto131.getYear() + " " + auto131.getSpeed() + " " + auto131.getWeight());
        System.out.println(auto141.getYear() + " " + auto141.getSpeed() + " " + auto141.getWeight() + " " + auto141.getColor());
    }
}
