/**
 * NewCalculator processing parts
 *
 * @author Valentyn Mozul
 * @version 1.0 from 09.04.2023
 */

package JavaKids.my_newCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewCalculatorEngine implements ActionListener {
    //ссылка на окно калькулятора
    NewCalculator parent;

    char selectedAction = ' '; // +, -, /, или *
    double currentResult = 0;

    NewCalculatorEngine(NewCalculator parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Получить источник действия
        JButton clickedJButton = (JButton) e.getSource();
        String jPlayField = parent.jTextField.getText();
        if(!clickedJButton.equals(".")){
            parent.jTextField.setText(parent.jTextField.getText() + ".");
        }

        double displayValue = 0;

        // Получить число из дисплея калькулятора,
        // если он не пустой.
        // Восклицательный знак – это оператор отрицания
        if (!"".equals(jPlayField)) {
            displayValue = Double.parseDouble(jPlayField);
        }

        Object src = e.getSource();
        // Для каждой кнопки арифметического действия
        // запомнить его: +, -, /, или *, сохранить текущее число
        // в переменной currentResult, и очистить дисплей
        // для ввода нового числа

        if (src == parent.bt_Plus) {
            selectedAction = '+';
            if (jPlayField.equals("")) {
                JOptionPane.showConfirmDialog(null,
                        "Не зрозуміло, що додавати",
                        "Just a test",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                currentResult = displayValue;
                parent.jTextField.setText("");
            }
        } else if (src == parent.bt_Minus) {
            selectedAction = '-';
            if (jPlayField.equals("")) {
                JOptionPane.showConfirmDialog(null,
                        "Не зрозуміло, що віднімати",
                        "Just a test",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                currentResult = displayValue;
                parent.jTextField.setText("");
            }
        } else if (src == parent.bt_Division) {
            selectedAction = '/';
            if (jPlayField.equals("")) {
                JOptionPane.showConfirmDialog(null,
                        "Не зрозуміло, що ділити",
                        "Just a test",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                currentResult = displayValue;
                parent.jTextField.setText("");
            }
        } else if (src == parent.bt_Multiplication) {
            selectedAction = '*';
            if (jPlayField.equals("")) {
                JOptionPane.showConfirmDialog(null,
                        "Не зрозуміло, що множити",
                        "Just a test",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                currentResult = displayValue;
                parent.jTextField.setText("");
            }
        } else if (src == parent.bt_Equals) {
            // Совершить арифметическое действие, в зависимости
            // от selectedAction, обновить переменную currentResult
            // и показать результат на дисплее
            if (selectedAction == '+') {
                currentResult += displayValue;
                // Сконвертировать результат в строку, добавляя его
                // к пустой строке и показать его
                parent.jTextField.setText("" + currentResult);
            } else if (selectedAction == '-') {
                currentResult -= displayValue;
                parent.jTextField.setText("" + currentResult);
            } else if (selectedAction == '/') {
                currentResult /= displayValue;
                parent.jTextField.setText("" + currentResult);
            } else if (selectedAction == '*') {
                currentResult *= displayValue;
                parent.jTextField.setText("" + currentResult);
            }
        } else {
            // Для всех цифровых кнопок присоединить надпись на
            // кнопке к надписи в дисплее
            String clickedJButtonLabel = clickedJButton.getText();
            parent.jTextField.setText(jPlayField + clickedJButtonLabel);
            System.out.print("jPlayField = " + jPlayField);
            System.out.println("clickedJButtonLabel = " + clickedJButtonLabel);
            System.out.println("=====");
        }
    }
}
