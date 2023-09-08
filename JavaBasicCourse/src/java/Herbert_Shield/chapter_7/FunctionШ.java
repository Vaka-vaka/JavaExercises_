/**
 * Ш++
 * task
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.01.2023
 */

package java.Herbert_Shield.chapter_7;

public class FunctionШ {
    private int b;
    private int a;

    private int c;

    FunctionШ(int b, int a){
        this.b = b;
        this.a = a;
    }

    FunctionШ(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int getB(){
        return b;
    }

    int getA(){
        return a;
    }

    int getC(){
        return c;
    }

    void setB(int b){
        this.b = b;
    }

    void setA(int a){
        this.a = a;
    }

    void setC(int c){
        this.c = c;
    }

    int task1(){
        int sumA = getA() * 4;
        int sumB = getB() * 2;
        return sumB + sumA;
    }

    int task2() {
        int sum = getA() + getB() + getC();
        int max = 0;
        if(getA() > getB() && getA() > getC()) max = getA();
        if(getB() > getA() && getB() > getC()) max = getB();
        if(getC() > getA() && getC() > getB())max = getC();

        if (sum >= 0 & sum <= 100)
            return 1;
        if(getA()==getB() & getB() == getC()) return -1;
        return max;
       //return Math.max(Math.max(a, b), c);
    }

    int task3(){
        int suma = getA() + getB();
        return 0;
    }
}

class FunctionDemo{
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        FunctionШ functionШ = new FunctionШ(10, 10);
        System.out.println(functionШ.task1());

        FunctionШ functionШ1 = new FunctionШ(50, 50, 50);
        FunctionШ functionШ2 = new FunctionШ(100, 300, 400);
        FunctionШ functionШ3 = new FunctionШ(20, 50, 30);
        System.out.println("return -1 = " + functionШ1.task2());
        System.out.println("return max = " + functionШ2.task2());
        System.out.println("return 1 = " + functionШ3.task2());
    }
}
