/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2024-04-04
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9;

import iT_VDN.java_Essential_New.lesson_9.lesson9.FileManager;

import java.util.Scanner;

public class Lesson9 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
//        greetUser();
       // String basePath = "W:/IT/Intelli IDEA(save projects)/JavaExercises/JavaBasicCourse/src/iT_VDN/java_Essential_New/lesson_9/lesson9/";
        String basePath = "W:/IT/Intelli IDEA(save projects)/JavaExercises/JavaBasicCourse/src/iT_VDN/java_Essential_New/lesson_9/home_work/";
        FileManager fileManager = new FileManager(basePath);
        String directoryName = "home_work_1";
        String fileName = "data.txt";
        fileManager.createDirectory(directoryName);
//        fileManager.createFile(directoryName, fileName);
//        fileManager.writeTextToFile(directoryName, fileName, "Тестові дані!\n" + "Hello!\n" + "How are you?");
//        fileManager.readTextFromFile(directoryName, fileName);
//        fileManager.copyFile("img.png", directoryName);
    }

    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        System.out.println("Hello! " + "Your name " + name + ", your age " + age);
    }
}
