/**
 * Determining the length of the hypotenuse from
 * the length of the cat-house's , by the Pythagoras theorem
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_2;

public class BoolDemo {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("Знaчeниe b: " + b);
        b = true;
        System.out.println("Знaчeниe b: " + b);

        // Логическое значение можно использовать для
        // управления условной инструкцией if
        if(b) System.out.println("Этa инструкция выполняется");
        b = false;
        if(b) System.out.println("Этa инструкция не выполняется");
        // В результате сравнения получается логическое значение
        System.out.println("Peзyльтaт сравнения 10 > 9 : " + (10 > 9));
    }
}
