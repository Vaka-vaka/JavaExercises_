/**
 * Write a calculator that allows you to add two numbers and see the result
 *
 * @author Valentyn Mozul
 * @version 1.0 from 29.03.2023
 */

package JavaKids.my_Calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    JPanel windowContent;
    JTextField displayField;
    Button[] numButtons;
    JButton buttonPoint;
    JButton buttonEquals;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonMultiplication;
    JButton buttonDivision;
    JPanel pl;
    JPanel pl2;

    // В конструкторе создаются все компоненты
    // и добавляются на фрейм с помощью комбинации
    // Borderlayout и Gridlayout
    Calculator() {
        windowContent = new JPanel();

        BorderLayout borderLayout = new BorderLayout();
        windowContent.setLayout(borderLayout);

        //Задаём схему для этой панели
        displayField = new JTextField(50);
        windowContent.add("North", displayField);

        buttonPoint = new JButton(".");
        buttonPoint.setBackground(Color.white);
        buttonEquals = new JButton("=");
        buttonEquals.setBackground(Color.white);
        buttonMultiplication = new JButton("*");
        buttonMultiplication.setBackground(Color.cyan);
        buttonDivision = new JButton("/");
        buttonDivision.setBackground(Color.cyan);
        buttonMinus = new JButton("-");
        buttonMinus.setBackground(Color.cyan);
        buttonPlus = new JButton("+");
        buttonPlus.setBackground(Color.cyan);

        // Создаём панель с GridLayout
        // которая содержит 12 кнопок - 10 кнопок с числами
        // и кнопки с точкой и знаком равно
        pl = new JPanel();
        pl2 = new JPanel();
        GridLayout gt = new GridLayout(4, 3);
        pl.setLayout(gt);
        GridLayout gt2 = new GridLayout(4, 1);
        pl2.setLayout(gt2);

        // Создаём кнопки, используя конструктор
        // класса JButton, который принимает текст
        // кнопки в качестве параметра
        numButtons = new Button[10];
        for (int i = 9; i >= 0; i--) {
            numButtons[i] = new Button(String.valueOf(i));
            numButtons[i].setBackground(Color.green);
            pl.add(numButtons[i]);
        }

        // Добавляем кнопки на панель p1
        pl.add(buttonPoint);
        pl.add(buttonEquals);

        // Добавляем кнопки на панель p2
        pl2.add(buttonDivision);
        pl2.add(buttonMultiplication);
        pl2.add(buttonMinus);
        pl2.add(buttonPlus);

        // Помещаем панель p1 в центральную область окна
        windowContent.add("Center", pl);
        windowContent.add("East", pl2);

        // Создаём фрейм (рамку) и задаём его основную панель
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        // делаем размер окна достаточным
        // для того, чтобы вместить все компоненты
        frame.pack();

        // Наконец, отображаем окно
        frame.setVisible(true);
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}