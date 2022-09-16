/**
 * Guessing game of letters, fourth version
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

import java.io.IOException;

public class Guess4 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'K';
        do{
            System.out.println("Зaдyмaнa буква из диапазона A- Z.");
            System.out.println("Пoпытaйтecь ее угадать : ");
            //Получение символа с клавиатуры
            ch = (char) System.in.read();

            //Отбрасывание всех остальных символов во входном буфере
            do {
                ignore = (char) System.in.read();
            }while (ignore != '\n');  //+

            if(ch == answer){
                System.out.println("** Правиль но ! **");
            }else {
                System.out.println(". . . Извините, нужная буква находится");
                if(ch > answer) System.out.println("ближe к началу алфавита");
                else System.out.println("ближe к концу алфавита");
                System.out.println("Пoвтopитe попытку!\n");
            }
        }while (answer != ch);
    }
}
