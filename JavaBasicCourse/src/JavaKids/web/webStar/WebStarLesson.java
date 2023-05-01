/**
 * webStar
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.04.2023
 */

package JavaKids.web.webStar;

import javax.swing.*;

public class WebStarLesson {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        jPanel.add(new JButton("submit"));
        jPanel.add(new JButton("submit2"));
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setBounds(750, 250, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
