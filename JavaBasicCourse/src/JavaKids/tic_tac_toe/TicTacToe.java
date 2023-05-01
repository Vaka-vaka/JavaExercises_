/**
 * Game tic tac toe
 * Игра крестики-нолики на доске 3x3
 *
 * @author Valentyn Mozul
 * @version 1.0 from 28.04.2023
 */

package JavaKids.tic_tac_toe;

import javax.swing.*;
import java.awt.*;

public class TicTacToe {
    JButton squares[];
    JButton newGameButton;
    Label score;
    int emptySquaresLeft = 9;

    // form
    JFrame jFrame = new JFrame("TicTacToe");

    // Создание панели для кнопок грид лояут(Менеджер расположения)
    JPanel jPanel = new JPanel(new GridLayout(3, 3));

    JButton bt_1 = new JButton("1");
    JButton bt_2 = new JButton("2");
    JButton bt_3 = new JButton("3");
    JButton bt_4 = new JButton("4");
    JButton bt_5 = new JButton("5");
    JButton bt_6 = new JButton("6");
    JButton bt_7 = new JButton("7");
    JButton bt_8 = new JButton("8");
    JButton bt_9 = new JButton("9");

    public TicTacToe() {
        jFrame.setSize(500, 500);

        //Обработка щелчка на системной кнопке закрытия окна
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new BorderLayout());

        //Задаем вид и размер шрифта кнопок
        bt_1.setFont(new Font("Tahoma", Font.BOLD, 10));
        bt_2.setFont(new Font("Tahoma", Font.BOLD, 10));
        bt_3.setFont(new Font("Tahoma", Font.BOLD, 10));
        bt_4.setFont(new Font("Tahoma", Font.BOLD, 10));
        bt_5.setFont(new Font("Tahoma", Font.BOLD, 10));
        bt_6.setFont(new Font("Tahoma", Font.BOLD, 10));
        bt_7.setFont(new Font("Tahoma", Font.BOLD, 10));
        bt_8.setFont(new Font("Tahoma", Font.BOLD, 10));
        bt_9.setFont(new Font("Tahoma", Font.BOLD, 10));

        //Добавление кнопки на панель
        jPanel.add(bt_1);
        jPanel.add(bt_2);
        jPanel.add(bt_3);
        jPanel.add(bt_4);
        jPanel.add(bt_5);
        jPanel.add(bt_6);
        jPanel.add(bt_7);
        jPanel.add(bt_8);
        jPanel.add(bt_9);

        //цвет панели
        jPanel.setBackground(Color.cyan);

        //Добавляем панель кнопок на форму
        jFrame.add(jPanel, BorderLayout.CENTER);

        // делаем размер окна достаточным
        // для того, чтобы вместить все компоненты
        jFrame.pack();

        //Видимость формы
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new TicTacTae();
    }
}
