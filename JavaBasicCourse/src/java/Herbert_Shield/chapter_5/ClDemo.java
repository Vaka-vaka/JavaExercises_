/**
 * Display of all data specified on the command line
 *
 * @author Valentyn Mozul
 * @version 1.0 from 01.11.2022
 */

package java.Herbert_Shield.chapter_5;

public class ClDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        System.out.println("Пpoгpaммe передано " + args.length + " аргумента командной строки.");

        System.out.println("Список аргументов : ");
        for (int i = 0; i < args.length; i++) {
            System.out.println("args [" + i + "] : " + args[i]);
        }
    }
}
