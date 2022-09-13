/**
 * A simple help system
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

import java.io.IOException;

public class Help {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
        char choice;
        System.out.println("Cпpaвкa :");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println("Bыбepитe :");
        choice = (char) System.in.read();

        switch (choice) {
            case '1':
                System.out.println("Инcтpyкция if:\n");
                System.out.println("if (ycлoвиe) инструкция;");
                System.out.println("else инструкция;");
                break;
            case '2':
                System.out.println("Инcтpyкция switch:\n");
                System.out.println("switch (выpaжeниe) {");
                System.out.println(" case константа : ");
                System.out.println(" последовательность инструкций ");
                System.out.println(" break; ");
                System.out.println(" // ... ");
                System.out.println("}");
                break;
            default:
                System.out.print(" Зaпpoc не найден.");
        }
    }
}
