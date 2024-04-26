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

    public int getNumber(int number) {
        return number * number;
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Server_HW_1 server_hw_1 = new Server_HW_1();
        int port = 12345;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущений. Очікування клієнта...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Клієнт підключений: " + clientSocket.getInetAddress());
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
                 PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {
                int number = Integer.parseInt(reader.readLine());
                System.out.println("Повідомлення від клієнта: " + number);
                //writer.println(number * number);
                writer.println(server_hw_1.getNumber(number));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
