/**
 * Calculator processing parts
 *
 * @author Valentyn Mozul
 * @version 1.0 from 05.04.2023
 */

package JavaKids.my_Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngineJButton implements ActionListener {
    Calculator parent; //ссылка на окно калькулятора

    char selectedAction = ' '; // +, -, /, или *
    int currentResult = 0;

    // Конструктор сохраняет ссылку на окно калькулятора
    // в переменной экземпляра класса
    CalculatorEngineJButton(Calculator parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Получить источник действия
        JButton clickedJButton = (JButton) e.getSource();
        String dispFieldText = parent.displayField.getText();

        int displayValue = 0;

        // Получить число из дисплея калькулятора,
        // если он не пустой.
        // Восклицательный знак – это оператор отрицания
        if (!"".equals(dispFieldText)) {
            displayValue = Integer.parseInt(dispFieldText);
        }

        Object src = e.getSource();
        // Для каждой кнопки арифметического действия
        // запомнить его: +, -, /, или *, сохранить текущее число
        // в переменной currentResult, и очистить дисплей
        // для ввода нового числа
        if (src == parent.buttonPlus) {
            selectedAction = '+';
            if (dispFieldText.equals("")) {
                JOptionPane.showConfirmDialog(null,
                        "Не зрозуміло, що додовати",
                        "Just a test",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                currentResult = displayValue;
                parent.displayField.setText("");
            }
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonMinus) {
            selectedAction = '-';
            if (dispFieldText.equals("")) {
                JOptionPane.showConfirmDialog(null,
                        "Не зрозуміло, що віднімати",
                        "Just a test",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                currentResult = displayValue;
                parent.displayField.setText("");
            }
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonDivision) {
            selectedAction = '/';
            if (dispFieldText.equals("")) {
                JOptionPane.showConfirmDialog(null,
                        "Не зрозуміло, що ділити",
                        "Just a test",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                currentResult = displayValue;
                parent.displayField.setText("");
            }
        } else if (src == parent.buttonMultiplication) {
            selectedAction = '*';
            if (dispFieldText.equals("")) {
                JOptionPane.showConfirmDialog(null,
                        "Не зрозуміло, що множити",
                        "Just a test",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                currentResult = displayValue;
                parent.displayField.setText("");
            }
        } else if (src == parent.buttonEquals) {
            // Совершить арифметическое действие, в зависимости
            // от selectedAction, обновить переменную currentResult
            // и показать результат на дисплее
            if (selectedAction == '+') {
                currentResult += displayValue;
                // Сконвертировать результат в строку, добавляя его
                // к пустой строке и показать его
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '-') {
                currentResult -= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '/') {
                currentResult /= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '*') {
                currentResult *= displayValue;
                parent.displayField.setText("" + currentResult);
            }
        } else {
            // Для всех цифровых кнопок присоединить надпись на
            // кнопке к надписи в дисплее
            String clickedJButtonLabel = clickedJButton.getText();
            parent.displayField.setText(dispFieldText + clickedJButtonLabel);
        }
    }
}
