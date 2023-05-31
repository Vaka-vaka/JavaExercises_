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
    JLabel score;
    int emptySquaresLeft = 9;

    static JFrame jFrame = getFrame();
    static JPanel topPanel = new JPanel();
    static JPanel centerPanel = new JPanel();

    public TicTacToe(){
        TicTacToeEngine toeEngine = new TicTacToeEngine(this);
        jFrame.setLayout(new BorderLayout());
        jFrame.setBackground(Color.CYAN);

        // Изменяем шрифт апплета так, чтобы он был жирным и имел размер 20
        Font font = new Font("Monospased", Font.BOLD, 20);
        jFrame.setFont(font);
        Font font2 = new Font("Tahoma", Font.BOLD, 50);
        topPanel.setFont(font2);
        centerPanel.setFont(font);

        // Создаем кнопку “New Game” и регистрируем в ней
        // слушатель действия
        jFrame.add(topPanel);
        newGameButton = new JButton("New Game");
        topPanel.add(newGameButton);
        newGameButton.addActionListener(toeEngine);
        jFrame.add(topPanel, "North");

        centerPanel.setLayout(new GridLayout(3, 3));
        jFrame.add(centerPanel, "Center");
        score = new JLabel("Your turn!");
        jFrame.add(score, "South");

        // создаем массив, чтобы хранить ссылки на 9 кнопок
        squares = new JButton[9];

        // Создаем кнопки, сохраняем ссылки на них в массиве
        // регистрируем в них слушатель, красим их
        // в оранжевый цвет и добавляем на панель
        for (int i = 0; i < 9; i++) {
            squares[i] = new JButton();
            squares[i].addActionListener(toeEngine);
            squares[i].setBackground(Color.ORANGE);
            centerPanel.add(squares[i]);
        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame("TicTacToe") {
        };
        jFrame.setVisible(true);
        jFrame.setBounds(600, 99, 650, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
