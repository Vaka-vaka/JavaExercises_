/**
 * how to swap the contents of variables
 * як обміняти вміст змінних місцями
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.01.2023
 */

package chapter_7;

public class HowToSwep {

    private int a;
    private int b;

    HowToSwep(int a, int b){
        this.a = a;
        this.b = b;
    }

    int getA(){
        return a;
    }

    int getB(){
        return b;
    }

    void setA(int a){
        this.a = a;
    }

    void setB(int b){
        this.b = b;
    }

    void getMethod(){
        System.out.println(a + " " + b);
        int x = a;
        int y = b;
        a = y;
        b = x;
        System.out.println(a + " " + b);
    }

    void getMethod2(){
        System.out.println(a + " " + b);
        int x = a;
        a = b;
        b = x;
        System.out.println(a + " " + b);
    }

    void getMethod3(){
        System.out.println(a + " " + b); //5 10
        a = a + b; //15
        b = a - b; //5
        a = a - b;
        System.out.println(a + " " + b);
    }

    void getMethod4(){
        System.out.println(a + " " + b);
        b = a + (a = b) - b;
        System.out.println(a + " " + b);
    }
}

class HowDemo{
    public static void main(String[] args) {
        HowToSwep howToSwep = new HowToSwep(5, 10);
        howToSwep.getMethod();
        System.out.println();
        howToSwep.getMethod2();
        System.out.println();
        howToSwep.getMethod3();
        System.out.println();
        howToSwep.getMethod4();
    }
}