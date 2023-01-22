/**
 * Creating an abstract class
 *
 * @author Valentyn Mozul
 * @version 1.0 from 17.01.2023
 */

package chapter_7;

abstract class TwoDShape9 { // Класс TwoDShape теперь абстрактный
    private double width;
    private double height;
    private String name;

    //Конструктор no умолчанию
    TwoDShape9(){
        width = height = 0.0;
        name = "none";
    }

    //Параметризированный конструктор
    TwoDShape9(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }

    //Создание объекта с одинаковыми значениями
    // переменных экземпляра width и height
    TwoDShape9(double x, String n){
        width = height = x;
        name = n;
    }

    // Создание одного объекта на основе другого
    TwoDShape9(TwoDShape9 ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    //Методы доступа к переменным width и height
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    String getName() {
        return name;
    }

    void showDim(){
        System.out.println("Шиpинa и высота - " + width + " and " + height);
    }

    //Теперь метод area() абстрактный
    abstract double area();  //Превращение area() в абстрактный метод
}

//Подкласс для представления треугольников,
// производный от класса TwoDShape
class Triangle9 extends TwoDShape9{
    private String style;

    // Конструктор по умолчанию
    Triangle9(){
        super();
        style = "none";
    }

    //Конструктор класса Triangle
    Triangle9(double w, double h, String s){
        super(w, h, "треугольник");
        style = s;
    }

    //Конструктор с одним аргументом для построения треугольника
    Triangle9(double x){
        super(x, "треугольник"); //вызвать конструктор суперкласса
        style = "закрашенны";
    }

    //Создание одного объекта на основе другого
    Triangle9(Triangle9 ob){
        super(ob); //передача объекта конструктору класса TwoDShape
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Tpeyгoльник " + style);
    }
}

class Rectangle9 extends TwoDShape9 {
    Rectangle9() {
        super();
    }

    // Конструктор класса Rectangle
    Rectangle9(double w, double h) {
        super(w, h, "прямоугольник"); //вызов конструктора суперкласса
    }

    //Создание квадрата
    Rectangle9(double x) {
        super(x, "прямоугольник"); //вызов конструктора суперкласса
    }

    //Создание одного объекта на основе другого
    Rectangle9(Rectangle9 ob) {
        super(ob); //передача объекта конструктору класса TwoDShape8
    }

    boolean isSquare() {
        if (getHeight() == getWidth()) return true;
        return false;
    }

    //Переопределение метода area() для класса Rectangle
    double area() {  //Переоnрелеление метода area() для класса Reactangle
        return getWidth() * getHeight();
    }
}

class AbsShape{
    public static void main(String[] args) {
        TwoDShape9[] shape9 = new TwoDShape9[4];

        shape9[0] = new Triangle9(8.0, 12.0, "контурный");
        shape9[1] = new Rectangle9(10);
        shape9[2] = new Rectangle9(10, 4);
        shape9[3] = new Triangle9(7.0);

        for (int a = 0; a < shape9.length; a++) {
            System.out.println("Oбъeкт - " + shape9[a].getName());
            System.out.println("Плoщaдь - " + shape9[a].area());
            System.out.println("And - " + shape9[a].getWidth());
            System.out.println("And - " + shape9[a].getHeight());
            System.out.println();
        }
        }
    }
