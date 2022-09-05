/**
 * Translating inches into meters
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package PrimitiveTypes;

public class InchesIntoMeters {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        double inch, meter;
        int counter;
        String a = "a";

        counter = 0;
        for(inch = 1; inch <= 100; inch++){
            meter = inch * 39.37;
            counter++;
            if(counter == 1)
                System.out.println(inch + " дюйм" + " = " + meter + " метрa");
            if(counter == 2)
                System.out.println(inch + " дюйм" + a + " = " + meter + " метрa");
            if(counter == 3)
                System.out.println(inch + " дюйм" + a + " = " + meter + " метрa");
            if(counter == 4)
                System.out.println(inch + " дюйм" + a + " = " + meter + " метрa");
            if(counter == 5)
                System.out.println(inch + " дюймов" + " = " + meter + " метрa");
            if(counter == 6)
                System.out.println(inch + " дюймов" + " = " + meter + " метрa");
            if(counter == 7)
                System.out.println(inch + " дюймов" + " = " + meter + " метрa");
            if(counter == 8)
                System.out.println(inch + " дюймов" + " = " + meter + " метрa");
            if(counter == 9)
                System.out.println(inch + " дюймов" + " = " + meter + " метрa");
            if(counter == 10)
                System.out.println(inch + " дюймов" + " = " + meter + " метрa");
            if(counter == 11)
                System.out.println(inch + " дюймов" + " = " + meter + " метрa");
            if(counter == 12)
                System.out.println(inch + " дюймов" + " = " + meter + " метрa");

           //System.out.println(inch + " дюйм" + a + " = " + meter + " метрa");

            if(counter == 12){
                System.out.println();
                counter = 0;
            }
        }
    }
}
