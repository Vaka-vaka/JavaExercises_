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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeEngine implements ActionListener {
    TicTacToe parent;

    TicTacToeEngine(TicTacToe parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton theButton = (JButton) e.getSource();

    }
}
