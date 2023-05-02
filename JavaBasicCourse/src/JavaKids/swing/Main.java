/**
 * swing
 *
 * @author Valentyn Mozul
 * @version 1.0 from 28.04.2023
 */

package JavaKids.swing;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
    JFrame jFrame = new JFrame() {};
    jFrame.setVisible(true);
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//    jFrame.setSize(500, 300);
//    jFrame.setLocation(300, 200);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300);
    jFrame.setTitle("this my app");
//    jFrame.setIconImage();
}
}
