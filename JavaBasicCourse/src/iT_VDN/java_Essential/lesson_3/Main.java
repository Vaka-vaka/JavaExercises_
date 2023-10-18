/**
 * java basic
 * lesson 3
 *
 * @version 1.0 from 2023-09-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_3;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        TextPrint printer = new TextPrint();
        TextPrint2 print2 = new TextPrint2();
        printer.value = "Hello Kostay";
        print2.value = "Hello Vaka";
        printer.print(print2.value);
        print2.print(printer.value);
    }
}
