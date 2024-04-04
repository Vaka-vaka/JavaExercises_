/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2024-04-04
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9;

import java.util.Scanner;

public class lesson9 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        System.out.println("Hello! " + "Your name " + name + ", your age " + age);
    }
}
