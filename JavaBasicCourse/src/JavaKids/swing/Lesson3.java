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
import java.beans.EventHandler;

public class Lesson3 {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
       JButton jButton = new JButton("Hello!");
       jPanel.add(jButton);
//       jButton.addActionListener(new ActionListener() {
//           @Override
//           public void actionPerformed(ActionEvent e) {
//               jFrame.setTitle(((JButton)e.getSource()).getText());
//           }
//       });
        //Екшен Лісенер в одну строку
        jButton.addActionListener(EventHandler.create
                (ActionListener.class, jFrame, "title", "source.text"));
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
