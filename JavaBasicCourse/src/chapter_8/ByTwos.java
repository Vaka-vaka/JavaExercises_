/**
 * Implementing the Series interface
 * Реализация интерфейса Series
 *
 * @author Valentyn Mozul
 * @version 1.0 from 14.02.2023
 */

package chapter_8;

import chapter_2.Sound;

public class ByTwos implements Series {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNex() {
        val = val + 2;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class BytDemo {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();
        for (int i = 0; i < 5; i++)
            System.out.println("Cлeдyющee значение : " + byTwos.getNex());

        System.out.println("\nCбpoc");
        byTwos.reset();
        for (int i = 0; i < 5; i++)
            System.out.println("Cлeдyющee значение : " + byTwos.getNex());

        System.out.println("\nHaчaльнoe значение : 100");
        byTwos.setStart(100);
        for (int i = 0; i < 5; i++)
            System.out.println("Cлeдyющee значение : " + byTwos.getNex());

    }
}