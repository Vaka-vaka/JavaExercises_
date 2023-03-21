/**
 * Создать метод принимающий на вход две переменные типа int.
 * Метод вычисляет их сумму и возвращает значение.
 * Вызвать этот метод из метода main.
 * Сделать методы для вычисления разницы, произведения и деления.
 *
 * @author Valentyn Mozul
 * @version 1.0 from 20.03.2023
 */

package tasks;

public class Calculator {
    int getSum(int number1, int number2) {
        return number1 + number2;
    }

    int getDifference(int number1, int number2) {
        if (number2 > number1) {
            int max = number2;
            number2 = number1;
            number1 = max;
        }
        return number1 - number2;
    }

    int getDivision(int number1, int number2) {
        if (number2 > number1) {
            int max = number2;
            number2 = number1;
            number1 = max;
        }
        return number1 / number2;
    }

    int getMultiplication(int number1, int number2) {
        return number1 * number2;
    }

}

class CalculatorDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int s = calculator.getSum(1, 1);
        System.out.println("Suma = " + s);

        int d = calculator.getDifference(5, 7);
        System.out.println("Difference = " + d);

        int div = calculator.getDivision(3, 6);
        System.out.println("Division = " + div);

        int m = calculator.getMultiplication(5, 3);
        System.out.println("Multiplication = " + m);
    }
}
