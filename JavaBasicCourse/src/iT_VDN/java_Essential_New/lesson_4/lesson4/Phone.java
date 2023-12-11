/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-12-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_4.lesson4;

public class Phone implements ElectronicDevice, CameraDevice {
    @Override
    public void turnOn() {
        System.out.println("Turning on the phone");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the phone");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo with the phone");
    }
}
