/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2023-11-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_9.home_work_2;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120000, "AB1234567CD");
        Device device2 = new Device("Samsung", 120000, "AB1234567CD");
        System.out.println(device + "\n" + device2);

        Monitor monitor = new Monitor("Samsung", 120000,
                "AB1234567CD", 1280, 1024);
        Monitor monitor2 = new Monitor("Samsung", 120000,
                "AB1234567CD", 1280, 1024);
        System.out.println(monitor + "\n" + monitor2);

        System.out.println("device = monitor - " + device.equals(monitor));
        System.out.println("device = device2- " + device.equals(device2));
        System.out.println("monitor = monitor2 - " + monitor.equals(monitor2));
        System.out.println("device = " + device.hashCode() + "\ndevice2 = " + device2.hashCode() +
                "\nmonitor = " + monitor.hashCode() + "\nmonitor2 = " + monitor2.hashCode());
        System.out.println("Two hashCode");
        if (monitor.hashCode() == monitor2.hashCode()) {
            System.out.println("monitor = monitor2 = true");
        } else {
            System.out.println("false");
        }

    }
}
