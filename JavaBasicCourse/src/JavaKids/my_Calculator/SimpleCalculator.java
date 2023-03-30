/**
 * Write a calculator that allows you to add two numbers and see the result
 *
 * @author Valentyn Mozul
 * @version 1.0 from 29.03.2023
 */

package JavaKids.my_Calculator;

import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {

        // Создаём панель
        JPanel windowContent = new JPanel();

        // Задаём менеджер отображения для этой панели
        FlowLayout fl = new FlowLayout();  //FlowLayout - построчное расположение
        windowContent.setLayout(fl);

        // Создаём компоненты в памяти
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum");
        JTextField result = new JTextField(10);
        JButton go = new JButton("add");

        // Добавляем компоненты на панель
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);

        // Создаём фрейм и задаём для него панель
        JFrame frame = new JFrame("My first calculator");
        frame.setContentPane(windowContent);

        //задаём и размер и делаем фрейм видимым
        frame.setSize(450, 100);
        frame.setVisible(true);
    }
}
