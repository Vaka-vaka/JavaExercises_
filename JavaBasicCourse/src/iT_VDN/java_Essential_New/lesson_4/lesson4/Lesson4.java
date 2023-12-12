/**
 * java basic
 * lesson 4
 *
 * @version 1.0 from 2023-12-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_4.lesson4;

public class Lesson4 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ElectronicDevice phone = new Phone();
        phone.turnOn();
        phone.turnOff();

        ElectronicDevice computer = new Computer();
        computer.turnOn();
        computer.turnOff();

        CameraDevice cameraDevice = new Phone();
        cameraDevice.takePhoto();
        cameraDevice.turnOn();
        cameraDevice.turnOff();

        Shape circle = new Circle(5);
        double area = circle.calculateArea();
        System.out.println("Circle area = " + area);

        Shape rectangle = new Rectangle(4, 6);
        double area1 = rectangle.calculateArea();
        System.out.println("Rectangle area = " + area1);

        Shape triangle = new Triangle(3, 8);
        double area2 = triangle.calculateArea();
        System.out.println("Triangle area = " + area2);
    }
}
