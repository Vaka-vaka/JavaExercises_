/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2023-10-23
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_8.home_work_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainPrice {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws Exception {
        // Создаем массив Price
        Price[] prices = new Price[1];

        // Создаем объект потока вывода BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // loop
        for (int i = 0; i < prices.length; i++) {
            String nameProduct = "";
            String nameStore = "";
            double price;

            // Вводим данные пока массив не заполнится
            System.out.println("Input name product: ");
            nameProduct = reader.readLine();
            System.out.println("Input name store: ");
            nameStore = reader.readLine();
            System.out.println("Input prices: ");
            price = Double.parseDouble(reader.readLine());

            //Добавление через конструктор
            prices[i] = new Price(nameProduct, nameStore, price);
        }

        // Вывод на экран
        for (Price price : prices) {
            System.out.println(price.toString());
        }

        // Вводим значение по условию
        System.out.println("Input name store");
        String strStore = reader.readLine();

        for (int i = 0; i < prices.length; i++) {
            String name = prices[i].nameStore;

            // По выполнению условия вывод на экран
            if (strStore.equals(name)) {
                System.out.println(prices[i]);
            } else {
                throw new Exception("there's no such store.");
            }
        }
    }
}
