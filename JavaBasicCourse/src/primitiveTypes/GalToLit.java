/**
 * Gallons to liters program
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package primitiveTypes;

public class GalToLit {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        double gallons;

        double liters;

        double LitersOnGallons;

        gallons = 10;

        liters = 3.7854;

        LitersOnGallons = gallons * liters;

        System.out.println("10 gallons = " + LitersOnGallons + " liters");
    }

}
