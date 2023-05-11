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

public class KeyStrokeLesson {
    static JFrame jFrame = getFrame();

    static JPanel jPanel = new JPanel();

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws Exception {
        jFrame.add(jPanel);
        AbstractAction myAction = new MyAction();
        JButton jButton = new JButton(myAction);
        jButton.setText("Hello!");
        jPanel.add(jButton);

        KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl B");
        InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(keyStroke, "changeColor");
        ActionMap actionMap = jPanel.getActionMap();
        actionMap.put("changeColor", myAction);
    }

    static class MyAction extends AbstractAction {

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
