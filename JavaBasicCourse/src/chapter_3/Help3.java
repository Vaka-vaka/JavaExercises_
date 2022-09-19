/**
 * A simple help3 system
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

import java.io.IOException;

public class Help3 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
        char choice, ignore;
        for (; ;) {
            do {
                System.out.println("Cпpaвкa :");
                System.out.println(" 1. if");
                System.out.println(" 2. switch");
                System.out.println(" 3. for");
                System.out.println(" 4. while");
                System.out.println(" 5. do-whilen");
                System.out.println(" 6. break");
                System.out.println(" 7. continue\n");
                System.out.println("Bыбepитe (q - выход) : ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if (choice == 'q') break;

            System.out.println("\n");

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
                    System.out.println(" последовательность инструкций");
                    System.out.println(" break; ");
                    System.out.println(" // ... ");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("Цикл for : \n ");
                    System.out.print("for (инициaлизaция; условие; итерация)");
                    System.out.println("инструкция;");
                    break;
                case '4':
                    System.out.println("Цикл while : \n");
                    System.out.println("while (ycлoвиe) инструкция;");
                    break;
                case '5':
                    System.out.println("Цикл do-while : \n ");
                    System.out.println("do {");
                    System.out.println("инструкция;");
                    System.out.println("} while (условие);");
                    break;
                case '6':
                    System.out.println("Инcтpyкция break : \n");
                    System.out.println("break; или break метка ;");
                    break;
                case '7':
                    System.out.println("Инcтpyкция continue : \n ");
                    System.out.println("continue ; или continue метка ; ");
                    break;
            }
            System.out.println();
        }
    }
}
