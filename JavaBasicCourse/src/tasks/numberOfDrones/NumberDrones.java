/**
 * Скласти програму для визначення кількості дронів,
 * які зможуть придбати волонтери за донати українців
 *
 * @author Valentyn Mozul
 * @version 1.0 from 21.03.2023
 */

package tasks.numberOfDrones;

import java.util.Scanner;

public class NumberDrones {
    final int DRON_PRICE = 3300;

    double getNumberDrones(int donationSum, double exchangeRate) {
        double numberDrones = (donationSum / exchangeRate);
        return numberDrones / DRON_PRICE;
    }
}

class NumberDronesDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws Exception {
        NumberDrones numberDrones = new NumberDrones();
        int donationSum = 0;
        double exchangeRate = 0;
        System.out.println("Рахуємо кількість дронів!!!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть суму внеску в гривні!");
        try {
            donationSum = scanner.nextInt();
            System.out.println(donationSum + " !!!");
        } catch (IllegalArgumentException exc) {
            System.out.println("Ви ввели не ціле число!!!" + exc);
        }
        System.out.println("Введіть курс валюти в гривні. Введіть дробове число через кому!!!");
        try {
            exchangeRate = scanner.nextDouble();
            System.out.println(exchangeRate + " !!!");
        } catch (IllegalArgumentException exception) {
            System.out.println("Ви ввели не дробове число!!!" + exception);
        }
        int sum = (int) numberDrones.getNumberDrones(donationSum, exchangeRate);
        System.out.println("Куплено " + sum + " дрон(ів)." + "\nСлава Україні!");
    }
}
