/**
 * swing
 *
 * @author Valentyn Mozul
 * @version 1.0 from 04.05.2023
 */

package JavaKids.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson2 {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton = new JButton("Hello!");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() { //екшен Лісенер
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.cyan);
            }
        });
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
