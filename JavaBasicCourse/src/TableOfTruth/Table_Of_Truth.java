package TableOfTruth;

/**
 * A program that prints <code>TableOfTruth</code>
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

public class Table_Of_Truth {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
        public static void main(String[] args) {
            System.out.println("Таблица истинности ^");
            System.out.println(true ^ true);
            System.out.println(true ^ false);
            System.out.println(false ^ true);
            System.out.println(false ^ false);
            System.out.println("Таблица истинности !=");
            System.out.println(true != true);
            System.out.println(true != false);
            System.out.println(false != true);
            System.out.println(false != false);
            System.out.println("Таблица истинности &");
            System.out.println(true & true);
            System.out.println(true & false);
            System.out.println(false & true);
            System.out.println(false & false);
            System.out.println("Таблица истинности &&");
            System.out.println(true && true);
            System.out.println(true && false);
            System.out.println(false && true);
            System.out.println(false && false);
            System.out.println("Таблица истинности |");
            System.out.println(true | true);
            System.out.println(true | false);
            System.out.println(false | true);
            System.out.println(false | false);
            System.out.println("Таблица истинности ||");
            System.out.println(true || true);
            System.out.println(true || false);
            System.out.println(false || true);
            System.out.println(false || false);
        }
}

