/**
 * Gravity on the Moon
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

/*Сила тяжести на Луне составляет около 17% земной. Напишите программу,
которая вычислила бы ваш вес на Луне.*/

package primitiveTypes;

public class Moon {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        double weight_Moon;
         double weight = 106.6;
          weight_Moon = (weight * 0.17);
           System.out.println("My weight on the moon - " + weight_Moon + " kg.");
    }
}
