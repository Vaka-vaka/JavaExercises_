/**
 * java basic
 * lesson 3
 *
 * @version 1.0 from 2023-09-12
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_3.documentWorker;

import java.util.Scanner;

public class MainDocumentWorker {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        DocumentWorker documentWorker = new DocumentWorker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Відбулася активація базового функціоналу програми.");
        System.out.println();
        System.out.println("Для доступу до версій про або експерт - необхідні ключі доступу:");
        System.out.println("Введіть ключ доступу від версії про або експерт. \n" +
                "Код має містити чотири цифри від 0 до 9.");
        int password = scanner.nextInt();
        if (password == 1234) {
            ProDocumentWorker proDocumentWorker = new ExpertDocumentWorker();
            System.out.println("Вітаємо з успішним придбанням Про версії");
        } else if (password == 4321) {
            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            System.out.println("Вітаємо з успішним придбанням Експерт версії");
        } else {
            System.out.println("Password is incorrect");
        }
    }
}
