/**
 * Calculator processing parts
 *
 * @author Valentyn Mozul
 * @version 1.0 from 04.04.2023
 */

package JavaKids.my_Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        JOptionPane.showConfirmDialog(null,
                "Something happened...",
                "Just a test",
                JOptionPane.PLAIN_MESSAGE);
    }
}