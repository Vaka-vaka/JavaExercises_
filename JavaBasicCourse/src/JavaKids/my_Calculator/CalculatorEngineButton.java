/**
 * Calculator processing parts
 *
 * @author Valentyn Mozul
 * @version 1.0 from 04.04.2023
 */

package JavaKids.my_Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngineButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        //Получаем источник события Button
        Button clickedButton = (Button) e.getSource();

        //Получаем надпись на кнопке Button
        String clickedButtonLabel = clickedButton.getLabel();

        // Добавляем надпись на кнопке к тексту окна сообщения
        JOptionPane.showConfirmDialog(null,
                "You pressed " + clickedButtonLabel,
                "Just a test",
                JOptionPane.PLAIN_MESSAGE);
    }
}