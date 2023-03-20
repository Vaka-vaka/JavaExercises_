/**
 * Создайте три класса: Car в пакете com.company.vehicles, Engine в пакете com.company.
 * details и Driver в пакете com.company.professions. Все три класса находятся в разных пакетах.
 * В main() методе класса Car создайте объекты класса Engine и Driver. При запуске Car программа
 * должна выводить на консоль "I'm driving!". Скомпилируйте и запустите программу.
 * Используйте аргументы командной строки при запуске Car: на вход программы подается несколько аргументов.
 * Программа должна распечатать их в следующем виде:
 * Value: знач1
 * Value: знач2
 *
 * @author Valentyn Mozul
 * @version 1.0 from 20.03.2023
 */

package tasks.firstJavaApplication.company.vehicles;

import tasks.firstJavaApplication.company.details.Engine;
import tasks.firstJavaApplication.company.driver.Driver;

public class Car {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Engine engine = new Engine();
        Driver driver = new Driver();

        System.out.println("I'm driving!");
    }
}
