/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-04-25
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client_HW_1 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введіть число для сервера: ");
            int number = scanner.nextInt();
            writer.println(number);
            int number2 = Integer.parseInt(reader.readLine());
            System.out.println("Відповідь від сервера: " + number2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
