/**
 * Создайте Swing-приложение для размещения заказов на покупку велосипедов.
 *
 * @author Valentyn Mozul
 * @version 1.0 from 11.05.2023
 */

package JavaKids.bikes;

import javax.swing.*;
import javax.swing.JTextField;
import java.awt.*;

public class BuyingBikes {
    JFrame jFrame = new JFrame("Bikes"); //form
    //Создание панели для кнопок грид лояут(Менеджер расположения)
    JPanel panel = new JPanel(new GridLayout(6,1));

    //Создаем текстовое поле
    javax.swing.JTextField jTextField = new JTextField(20);
    javax.swing.JTextField jTextField2 = new JTextField(20);

    //Создаем кнопки
    JButton bt7 = new JButton("Розмістити заказ!");
    JButton bt8 = new JButton("Підтвердити заказ!");

    BuyingBikes(){
        jFrame.setSize(300, 270);

        //Обработка щелчка на системной кнопке закрытия окна
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new BorderLayout());

        //Задаем вид и размер шрифта кнопок
        bt7.setFont(new Font("Tahoma", Font.BOLD, 15));
        bt8.setFont(new Font("Tahoma", Font.BOLD, 15));

        //Добавление кнопки на панель
        JLabel jLabelM = new JLabel("Модель велосипеда");

        panel.add(jLabelM);
        panel.add(jTextField);
        jTextField.getText();
        JLabel jLabelC = new JLabel("Кількість велисопедів");
        panel.add(jLabelC);
        panel.add(jTextField2);
        jTextField2.getText();
        panel.add(bt7);
        panel.add(bt8);

        //Добавляем панель кнопок на форму
        jFrame.add(panel);

        //цвет панели
        panel.setBackground(Color.cyan);

        //Видимость формы
        jFrame.setVisible(true);

        BuyingBikesEngine bikesEngine = new BuyingBikesEngine(this);
        jTextField.addActionListener(bikesEngine);
        jTextField2.addActionListener(bikesEngine);
        bt7.addActionListener(bikesEngine);
        bt8.addActionListener(bikesEngine);
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        new BuyingBikes();
    }
}
