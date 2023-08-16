/**
 * demo list
 *
 * @author Valentyn Mozul
 * @version 1.0 from 27.07.2023
 */

package java_ChanJamie.chapter_9.listDemo;

import java.util.ArrayList;

public class MyClass {
    //Чтобы получить ArrayList<Integer> в параметре, следует
    //объявить метод в виде
    public void methodOne(ArrayList<Integer> m) {
        m.add(40);
        m.add(43);
        m.add(23);
    }

    //Чтобы вернуть ArrayList<Integer> из метода, объявление
    //метода должно выглядеть так
    public ArrayList<Integer> methodTwo() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(343);
        a.add(343343);
        a.add(544);
        return a;
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyClass mc = new MyClass();

        ArrayList<Integer> b = new ArrayList<>();
        mc.methodOne(b);
        System.out.println(b);

        ArrayList<Integer> c = mc.methodTwo();
        System.out.println(c);
    }
}
