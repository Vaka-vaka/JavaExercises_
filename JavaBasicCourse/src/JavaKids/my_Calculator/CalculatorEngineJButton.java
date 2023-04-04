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
    double currentResult = 0;

    // Конструктор сохраняет ссылку на окно калькулятора
    // в переменной экземпляра класса
    CalculatorEngineJButton(Calculator parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Получаем источник события JButton
        JButton clickedJButton = (JButton) e.getSource();

        //Получаем надпись на кнопке JButton
        String clickedJButtonLabel = clickedJButton.getText();

        // Добавляем надпись на кнопке к тексту окна сообщения
        JOptionPane.showConfirmDialog(null,
                "You pressed " + clickedJButtonLabel,
                "Just a test",
                JOptionPane.PLAIN_MESSAGE);
    }
}
