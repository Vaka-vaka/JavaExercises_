/**
 * swing
 *
 * @author Valentyn Mozul
 * @version 1.0 from 11.05.2023
 */

package JavaKids.swing;

import javax.swing.*;

public class JTextField {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        jFrame.add(jPanel);
        jPanel.add(new JLabel("Enter go name "));
        jPanel.add(new javax.swing.JTextField("Name :", 20));
        javax.swing.JTextField jTextField = new javax.swing.JTextField();
        jTextField.getText();
        jPanel.add(new JLabel("Password :"));
        jPanel.add(new JPasswordField(20));
        JTextArea jTextArea = new JTextArea(5, 20);
        jTextArea.setLineWrap(true);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jPanel.add(jScrollPane);
        jPanel.revalidate();
    }

    static JFrame getJFrame() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(750, 250, 350, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }
}
