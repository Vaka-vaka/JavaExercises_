/**
 * applets
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.04.2023
 */

package JavaKids.web;

import javax.swing.*;

public class Applet extends JApplet {
    public void init() {
        add(new JButton(getParameter("buttonName")));
    }
}
