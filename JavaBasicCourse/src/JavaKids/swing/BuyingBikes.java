/**
 * Создайте Swing-приложение для размещения заказов на покупку велосипедов.
 *
 * @author Valentyn Mozul
 * @version 1.0 from 11.05.2023
 */

package JavaKids.swing;

import javax.swing.*;
import javax.swing.JTextField;
import java.awt.*;

public class BuyingBikes {
    JFrame jFrame = new JFrame("Bikes"); //form
    //Создание панели для кнопок грид лояут(Менеджер расположения)
    JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));

    //Создаем текстовое поле
    javax.swing.JTextField jTextField = new JTextField(20);

    BuyingBikes(){
        jFrame.setSize(330, 300);

        //Обработка щелчка на системной кнопке закрытия окна
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new BorderLayout());

        //Добавляем панель кнопок на форму
        jFrame.add(panel, BorderLayout.CENTER);



        //Установка шрифта и размер текстового поля
        jTextField.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        //цвет панели
        panel.setBackground(Color.cyan);

        //Видимость формы
        jFrame.setVisible(true);
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
