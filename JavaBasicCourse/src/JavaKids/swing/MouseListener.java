/**
 * swing
 *
 * @author Valentyn Mozul
 * @version 1.0 from 05.05.2023
 */

package JavaKids.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListener {
    static JFrame jFrame = getFrame();

    static JPanel jPanel = new JPanel();

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
//        jFrame.add(jPanel);
//        jPanel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                super.mouseClicked(e);
//                jPanel.setBackground(Color.cyan);
//            }
//        });
        JComponent jComponent = new MyComponent();
        jFrame.add(jComponent);
        jFrame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                MyComponent.xCoord = e.getX();
                MyComponent.yCoord = e.getY();
                jComponent.repaint();
            }
        });
    }

    static class MyComponent extends JComponent {
        public static int xCoord;
        public static int yCoord;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ((Graphics2D) g).drawString("Coordinates x: " + xCoord + " y :" + yCoord, 50, 50);
        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setBounds(600, 99, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
