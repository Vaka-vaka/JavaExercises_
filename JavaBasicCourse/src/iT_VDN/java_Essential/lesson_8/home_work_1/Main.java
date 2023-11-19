/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2023-10-19
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_8.home_work_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
        // Переменная для switch
        String operation;

        // Создаем екземпляр класа Calculator
        Calculator calc = new Calculator();

        // Создаем обьект потока вывода из класа java.io
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("========");

            System.out.print("To enable enter 1: ");
            int on = Integer.parseInt(reader.readLine());

            if (on == 1) {
                System.out.print("Input a: ");
                double a = Double.parseDouble(reader.readLine());

                System.out.print("Input b: ");
                double b = Double.parseDouble(reader.readLine());

                System.out.print("Input operation(+, -, *, /):");
                operation = reader.readLine();

                // Создаем switch по операции
                switch (operation) {
                    case "+":
                        System.out.println("Answer is: " + calc.add(a, b));
                        break;
                    case "-":
                        System.out.println("Answer is: " + calc.sub(a, b));
                        break;
                    case "*":
                        System.out.println("Answer is: " + calc.mul(a, b));
                        break;
                    case "/":
                        // try - catch для отлавливания ошибок
                        try {
                            System.out.println("Answer is: " + calc.div(a, b));
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Wrong operation!");
                }
            } else {
                System.out.println("To turn off");
                break;
            }
        }
    }
}
