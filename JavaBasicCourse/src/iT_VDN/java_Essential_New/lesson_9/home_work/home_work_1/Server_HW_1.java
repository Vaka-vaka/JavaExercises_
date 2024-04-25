/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-04-24
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_HW_1 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int port = 12345;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущений. Очікування клієнта...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Клієнт підключений: " + clientSocket.getInetAddress());
                try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {
                    String message = reader.readLine();
                    System.out.println("Повідомлення від клієнта: " + message);
                    writer.println("Hello, client");
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
