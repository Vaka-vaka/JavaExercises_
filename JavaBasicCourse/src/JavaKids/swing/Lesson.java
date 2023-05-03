/**
 * swing
 *
 * @author Valentyn Mozul
 * @version 1.0 from 01.05.2023
 */

package JavaKids.swing;

import tasks.Car;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class Lesson {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();

        jFrame.add(new MyComponent());
//        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        for (String s : fonts){
//            System.out.println(s);
//        }
    }

    static class MyComponent extends JComponent{
        @Override
        protected void paintComponent(Graphics g) {
           Font font = new Font("Modern No. 20", Font.BOLD, 20);
           Graphics2D g2 = (Graphics2D) g;
           g2.setFont(font);
           g2.drawString("Hello Natali!", 50, 50);
            Point2D p1 = new Point2D.Double(70, 70);
            Point2D p2 = new Point2D.Double(170, 170);
            Line2D line2D = new Line2D.Double(p1, p2);
            g2.setPaint(Color.GREEN);
            g2.draw(line2D);
            Ellipse2D ellipse2D = new Ellipse2D.Double();
            g2.setPaint(Color.RED);
            ellipse2D.setFrameFromDiagonal(p1, p2);
            g2.draw(ellipse2D);
            //  g2.fill(ellipse2D); //закрасить
            Rectangle2D r2 = new Rectangle2D.Double();
            r2.setFrameFromDiagonal(p1, p2);
            g2.draw(r2);
//            try {
//                URL url = new URL("https://moonzori.com/pryvitannya-z-dnem-narodzhennya-v-prozi/");
//                Image image = new ImageIcon(url).getImage();
//                g2.drawImage(image, 220, 70, null);
//            } catch (MalformedURLException e) {
//                throw new RuntimeException(e);
//            }
            Image image = new ImageIcon("img/Java.jpg").getImage();
            g2.drawImage(image, 220, 70, null);
        }
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 800, 800);
        return jFrame;
    }
}
