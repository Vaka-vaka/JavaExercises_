/**
 * Implementing the Series interface
 * and adding the get Previous() method
 * <p>
 * Реализация интерфейса Series
 * и добавление метода get Previous()
 *
 * @author Valentyn Mozul
 * @version 1.0 from 15.02.2023
 */

package chapter_8;

public class ByTwos2 implements Series {
    int start;
    int val;
    int prev;

    ByTwos2() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public int getNex() {
        prev = val;
        val += 2;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }

    int getPrevious() {
        return prev;
    }
}

class ByTwos2Demo {
    public static void main(String[] args) {
        ByTwos2 byTwos2 = new ByTwos2();
        System.out.println(byTwos2.getPrevious());
        for (int i = 0; i < 5; i++)
            System.out.println("Cлeдyющee значение : " + byTwos2.getNex());

        System.out.println("\nCбpoc");
        byTwos2.reset();
        for (int i = 0; i < 5; i++)
            System.out.println("Cлeдyющee значение : " + byTwos2.getNex());

        System.out.println("\nHaчaльнoe значение : 100");
        byTwos2.setStart(100);
        for (int i = 0; i < 5; i++)
            System.out.println("Cлeдyющee значение : " + byTwos2.getNex());
    }
}
