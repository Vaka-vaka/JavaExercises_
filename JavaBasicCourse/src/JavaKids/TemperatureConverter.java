/**
 * Create a new class and name it
 * TemperatureConverter. Add to it the method
 * to convert the temperature
 *
 * @author Valentyn Mozul
 * @version 1.0 from 28.03.2023
 */

package JavaKids;

import static JavaKids.TemperatureConverter.convertTemp;

class TemperatureConverter {
    public static double convertTemp(int temperatura, char converTo) {
        if (converTo == 'f') {
            return (temperatura * 1.8) + 32;
        } else {
            return (temperatura - 32) / 1.8;
        }
    }
}

class TemperatureConvertDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int temp = (int) convertTemp(10, 'f');
        System.out.println(temp);
    }
}
