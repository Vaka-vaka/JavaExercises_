/**
 * Using the break instruction to exit the loop
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_3;

public class BreakDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int num;
        num = 100;
        // Выполнение цикла до тех пор, пока квадрат значения
        // переменной i меньше значения переменной num
        for(int i = 0; i < num; i++){
            if(i * i >= num) break; //прекращение выполнения цикла,
                                     // если i*i >= 100
            System.out.print(i + ":" + i*i + " - ");
        }
        System.out.println("Цикл завершен.");
    }
}
