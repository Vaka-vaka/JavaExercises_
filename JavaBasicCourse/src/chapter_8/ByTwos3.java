/**
 * Using interface links
 * Использование интерфейсных ссылок
 *
 * @author Valentyn Mozul
 * @version 1.0 from 17.02.2023
 */

package chapter_8;

public class ByTwos3 implements Series {
    int start;
    int val;

    ByTwos3() {
        start = 0;
        val = 0;
    }

    public int getNex() {
        val += 2;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class ByThrees1 implements Series {
    int start;
    int val;

    ByThrees1() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNex() {
        val += 3;
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

class SeriesDemo {
    public static void main(String[] args) {
        ByTwos3 byTwos3 = new ByTwos3();
        ByThrees1 byThrees1 = new ByThrees1();
        Series ob;

        for (int i = 0; i < 5; i++) {
            ob = byTwos3;
            System.out.println("Cлeдyющee значение ByTwos : " + ob.getNex());

            ob = byThrees1;
            System.out.println("Cлeдyющee значение Next ByThrees : " + ob.getNex());
        }
    }
}