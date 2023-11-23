package iT_VDN.java_Essential_New.lesson_2.test;

public class Car {
    private String brand;
    private int year;
    private String color;
    private String model;

    public Car() {
        System.out.println("Some logic...");
    }

    public Car addModel(String model) {
        this.model = model;
        return this;
    }

    public Car addYear(int year) {
        this.year = year;
        return this;
    }

    public Car(String brand, int year, String color, String model) {
        this();
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void showInfo() {
        System.out.println(brand);
        System.out.println(year);
        System.out.println(color);
        System.out.println(model);
    }
}
