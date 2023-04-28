/**
 * NewCalculator visual parts
 *
 * @author Valentyn Mozul
 * @version 1.0 from 07.04.2023
 */

package JavaKids.my_newCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewCalculator_2 {
    JFrame jFrame = new JFrame("Calculator"); //form

    //Создание панели для кнопок грид лояут(Менеджер расположения)
    JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));
   //JPanel panel2 = new JPanel(new GridLayout(1, 1));
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
    JButton bt_Coma = new JButton(".");
    JButton bt0 = new JButton("0");
    JButton bt_Equals = new JButton("=");
    JButton bt_Plus = new JButton("+");
    JButton bt_Minus = new JButton("-");
   // JButton bt_Update = new JButton("C");

    public NewCalculator_2() {
        double[] first_value = {0};
        String[] operation = {"+"};

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
       // bt_Update.setFont(new Font("Tahoma", Font.BOLD, 20));

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
      //  panel2.add(bt_Update);
        button_equal.add(bt_Equals);

        //цвет панели
        panel.setBackground(Color.cyan);
     //   panel2.setBackground(Color.cyan);

        //Добавляем текстовое поле на панель
        panel_text.add(jTextField, BorderLayout.NORTH);

        //Добавляем панель текста на форму
        jFrame.add(panel_text, BorderLayout.NORTH);

        //Добавляем панель кнопок на форму
        jFrame.add(panel, BorderLayout.CENTER);
        jFrame.add(button_equal, BorderLayout.SOUTH);
      //  jFrame.add(panel2, BorderLayout.EAST);

        //Видимость формы
        jFrame.setVisible(true);

        //Обработчики события "Нажатие на кнопку"
        // ActionListener - слушатель
        bt0.addActionListener(e -> jTextField.setText(jTextField.getText() + "0"));
        bt1.addActionListener(e -> jTextField.setText(jTextField.getText() + "1"));
        bt2.addActionListener(e -> jTextField.setText(jTextField.getText() + "2"));
        bt3.addActionListener(e -> jTextField.setText(jTextField.getText() + "3"));
        bt4.addActionListener(e -> jTextField.setText(jTextField.getText() + "4"));
        bt5.addActionListener(e -> jTextField.setText(jTextField.getText() + "5"));
        bt6.addActionListener(e -> jTextField.setText(jTextField.getText() + "6"));
        bt7.addActionListener(e -> jTextField.setText(jTextField.getText() + "7"));
        bt8.addActionListener(e -> jTextField.setText(jTextField.getText() + "8"));
        bt9.addActionListener(e -> jTextField.setText(jTextField.getText() + "9"));
        bt_Coma.addActionListener(new ActionListener() {
            String text;

            @Override
            public void actionPerformed(ActionEvent e) {
                text = jTextField.getText();
                if (!text.contains(".")) {
                    jTextField.setText(jTextField.getText() + ".");
                }
            }
        });
        //При нажатии на "C" удаляем последнюю цифру
        bt_Delete.addActionListener(e -> {
            String temp = jTextField.getText();
            //обрабатываем исключение, чтобы не было возможности стереть пустое значение
            try {
                jTextField.setText(temp.substring(0, temp.length() - 1));
            } catch (Exception e1) {
                jTextField.setText(jTextField.getText() + "Пусто!");
            }
        });

//        Работаем с кнопками операции
//        Для каждого арифметического действия запомнить его, сохранить текущее число в переменной first_value и
//        сбрасывать число для ввода нового
        bt_Minus.addActionListener(e -> {
            try {
                first_value[0] = Double.parseDouble(jTextField.getText());
            } catch (Exception ignored) {
            }
            jTextField.setText("");
            operation[0] = "-";
        });
        bt_Division.addActionListener(e -> {
            try {
                first_value[0] = Double.parseDouble(jTextField.getText());
            } catch (Exception ignored) {
            }
            jTextField.setText("");
            operation[0] = "/";
        });
        bt_Multiplication.addActionListener(e -> {
            try {
                first_value[0] = Double.parseDouble(jTextField.getText());
            } catch (Exception ignored) {
            }
            jTextField.setText("");
            operation[0] = "*";
        });
        bt_Plus.addActionListener(e -> {
            try {
                first_value[0] = Double.parseDouble(jTextField.getText());
            } catch (Exception ignored) {
            }
            jTextField.setText("");
            operation[0] = "+";
        });

        // При нажатии на равно, считаем второе значение с текстового поля
        bt_Equals.addActionListener(e -> {
            try {
                double secondValue = Double.parseDouble(jTextField.getText());
                if ("+".equals(operation[0])) {
                    jTextField.setText((first_value[0] + secondValue) + "");
                }
                if ("-".equals(operation[0])) {
                    jTextField.setText((first_value[0] - secondValue) + "");
                }
                if ("/".equals(operation[0])) {
                    jTextField.setText((first_value[0] / secondValue) + "");
                }
                if ("*".equals(operation[0])) {
                    jTextField.setText((first_value[0] * secondValue) + "");
                }
            } catch (Exception ignored) {
            }
        });
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        new NewCalculator_2();
    }
}