/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2023-10-19
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_8.home_work_1;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        //double s = 0;
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Спроба ділення на нуль");
        }
    }
}
