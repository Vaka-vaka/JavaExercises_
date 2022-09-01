/**
 * This program displays a table for converting gallons to liters
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package PrimitiveTypes;

public class GalToLitTaЬle {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // преобразование в литры
            System.out.println(gallons + " галлонам соответ ствует " +
                    liters + " литра.");
            counter++; // Увеличивать значение счетчика строк на 1 на каждой итерации цикла
            if (counter == 10) { // Если значение счетчика равно 1О, вывести пустую строку
                System.out.println();
                counter = 0; // сбросить счетчик строк
            }
        }
    }
}
