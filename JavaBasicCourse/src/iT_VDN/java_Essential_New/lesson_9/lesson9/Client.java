/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2024-04-23
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); PrintWriter writer = new PrintWriter(socket.getOutputStream(), true); Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введіть повідомлення для сервера: ");
            String message = scanner.nextLine();
            writer.println(message);
            String response = reader.readLine();
            System.out.println("Відповідь від сервера: " + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
