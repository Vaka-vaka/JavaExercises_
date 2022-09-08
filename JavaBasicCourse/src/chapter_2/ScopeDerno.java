/**
 * Demonstration of the scope of the code block
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_2;

public class ScopeDerno {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int x; // Эта переменная доступна для в сего кода в
                // методе main
        x = 10;
        if (x == 10) {  // Начало новой области действия
            int y = 20;  // Эта переменная доступна только
                        // в данном блоке
            // Обе переменные, "х" и "у", доступны в данном блоке кода
            System.out.println("x и у : "+ x +" " + y);
            x = y * 2;
        }
        // у= 100 ; / / Ошибка ! В этом месте переменная "у" недоступна
        // А переменная "х" по-прежнему доступна
        System.out.println("x - это " + x);
    }
}
