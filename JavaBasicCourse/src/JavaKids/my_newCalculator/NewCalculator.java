/**
 * NewCalculator visual parts
 *
 * @author Valentyn Mozul
 * @version 1.0 from 07.04.2023
 */

package JavaKids.my_newCalculator;

import javax.swing.*;
import java.awt.*;

public class NewCalculator {
    JFrame jFrame = new JFrame("Calculator"); //form

    //Создание панели для кнопок грид лояут(Менеджер расположения)
    JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));
    JPanel panel2 = new JPanel(new GridLayout(1, 1));
    JPanel button_equal = new JPanel(new BorderLayout(1, 1));

    //Создаем панель для текста
    JPanel panel_text = new JPanel(new BorderLayout());

    //Создаем текстовое поле
    JTextField jTextField = new JTextField(20);

    //Создаем кнопки
    JButton bt7 = new JButton("7");
    JButton bt8 = new JButton("8");
    JButton bt9 = new JButton("9");
    JButton bt_Delete = new JButton("<");
    JButton bt4 = new JButton("4");
    JButton bt5 = new JButton("5");
    JButton bt6 = new JButton("6");
    JButton bt_Division = new JButton("/");
    JButton bt1 = new JButton("1");
    JButton bt2 = new JButton("2");
    JButton bt3 = new JButton("3");
    JButton bt_Multiplication = new JButton("*");
    JButton bt_Coma = new JButton(",");
    JButton bt0 = new JButton("0");
    JButton bt_Equals = new JButton("=");
    JButton bt_Plus = new JButton("+");
    JButton bt_Minus = new JButton("-");
    JButton bt_Update = new JButton("C");

    public NewCalculator() {
        jFrame.setSize(330, 300);

        //Обработка щелчка на системной кнопке закрытия окна
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new BorderLayout());

        //Выравнивание текста в поле по правому краю
        jTextField.setHorizontalAlignment(JTextField.RIGHT);

        //Установка шрифта и размер текстового поля
        jTextField.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        //Задаем вид и размер шрифта кнопок
        bt_Delete.setFont(new Font("Tahoma", Font.BOLD, 12));
        bt_Division.setFont(new Font("Tahoma", Font.BOLD, 15));
        bt_Multiplication.setFont(new Font("Tahoma", Font.BOLD, 15));
        bt_Coma.setFont(new Font("Tahoma", Font.BOLD, 15));
        bt_Equals.setFont(new Font("Tahoma", Font.BOLD, 20));
        bt_Plus.setFont(new Font("Tahoma", Font.BOLD, 15));
        bt_Minus.setFont(new Font("Tahoma", Font.BOLD, 20));
        bt_Update.setFont(new Font("Tahoma", Font.BOLD, 20));

        //Добавление кнопки на панель
        panel.add(bt7);
        panel.add(bt8);
        panel.add(bt9);
        panel.add(bt_Delete);
        panel.add(bt4);
        panel.add(bt5);
        panel.add(bt6);
        panel.add(bt_Division);
        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);
        panel.add(bt_Multiplication);
        panel.add(bt_Coma);
        panel.add(bt0);
        panel.add(bt_Plus);
        panel.add(bt_Minus);
        panel2.add(bt_Update);
        button_equal.add(bt_Equals);

        //цвет панели
        panel.setBackground(Color.cyan);
        panel2.setBackground(Color.cyan);

        //Добавляем текстовое поле на панель
        panel_text.add(jTextField, BorderLayout.NORTH);

        //Добавляем панель текста на форму
        jFrame.add(panel_text, BorderLayout.NORTH);

        //Добавляем панель кнопок на форму
        jFrame.add(panel, BorderLayout.CENTER);
        jFrame.add(button_equal, BorderLayout.SOUTH);
        jFrame.add(panel2, BorderLayout.EAST);

        //Видимость формы
        jFrame.setVisible(true);

        NewCalculatorEngine engine = new NewCalculatorEngine(this);
        bt7.addActionListener(engine);
        bt8.addActionListener(engine);
        bt9.addActionListener(engine);
        bt4.addActionListener(engine);
        bt5.addActionListener(engine);
        bt6.addActionListener(engine);
        bt1.addActionListener(engine);
        bt2.addActionListener(engine);
        bt3.addActionListener(engine);
        bt0.addActionListener(engine);
        bt_Minus.addActionListener(engine);
        bt_Plus.addActionListener(engine);
        bt_Multiplication.addActionListener(engine);
        bt_Division.addActionListener(engine);
        bt_Coma.addActionListener(engine);
        bt_Equals.addActionListener(engine);
        bt_Delete.addActionListener(engine);
        bt_Update.addActionListener(engine);
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        new NewCalculator();
    }
}