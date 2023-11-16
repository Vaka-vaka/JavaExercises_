/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2023-11-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_9.home_work_2;

import java.util.Objects;

public class Device {
    //home_work_2
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    //home_work_3
    @Override
    public String toString() {
        return "Device : manufacturer = " + getManufacturer() + ", " + "price = " + getPrice() +
                ", " + "serialNumber = " + getSerialNumber();
    }

    //home_work_4
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0
                && manufacturer.equals(device.manufacturer) && serialNumber.equals(device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }
}
