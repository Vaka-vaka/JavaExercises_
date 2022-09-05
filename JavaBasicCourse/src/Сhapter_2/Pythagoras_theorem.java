/**
 * Determining the length of the hypotenuse from
 * the length of the cat-house's , by the Pythagoras theorem
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package Сhapter_2;

public class Pythagoras_theorem {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        double x, y, z;
        x = 3;
        y = 4;
        /* Например, метод sqrt (), определенный в стандартном классе Math,
        возвращает значение douЫe, являющееся квадратным корнем значения аргумента
        этого метода, также представленного типом douЫe. */
        z = Math.sqrt(x*x + y*y);
        System.out.println("Длинa гипотенузы : " + z);

    }
}
