/**
 * Write a calculator that allows you to add two numbers and see the result
 *
 * @author Valentyn Mozul
 * @version 1.0 from 29.03.2023
 */

package JavaKids.my_Calculator;

import javax.swing.*;
import java.awt.*;

public class SimpleCalculatorGrid {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {

        // Создаём панель
        JPanel windowContent = new JPanel();

        // Задаём менеджер расположения для этой панели
        GridLayout gridLayout = new GridLayout(4, 2, 5, 5);
        windowContent.setLayout(gridLayout);

        // Создаём компоненты в памяти
        JLabel label1 = new JLabel("  Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("  Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("  Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("  add");

        // Добавляем компоненты в панель
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);

        // Создаём рамку и задаём панель для него
        JFrame frame = new JFrame("My First calculator");
        frame.setContentPane(windowContent);

        // задаём размер и отображаем окно
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
