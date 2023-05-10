/**
 * swing Actions
 *
 * @author Valentyn Mozul
 * @version 1.0 from 04.05.2023
 */

package JavaKids.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Lesson6 {
    static JFrame jFrame = getFrame();

    static JPanel jPanel = new JPanel();

    public static void main(String[] args) throws Exception {
        jFrame.add(jPanel);
        JButton jButton = new JButton(new MyAction());
        jButton.setText("Hello!");
        jPanel.add(jButton);
    }

    static class MyAction extends AbstractAction {

        MyAction() {
            putValue(AbstractAction.SHORT_DESCRIPTION, "My small action");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.cyan);
        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setBounds(750, 250, 500, 500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        return jFrame;
    }
}
