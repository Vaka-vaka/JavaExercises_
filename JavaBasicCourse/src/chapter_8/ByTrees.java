/**
 * Another implementation of the Series interface
 * <p>
 * Еще одна реализация интерфейса Series
 *
 * @author Valentyn Mozul
 * @version 1.0 from 16.02.2023
 */

package chapter_8;

public class ByTrees implements Series {
    int start;
    int val;

    ByTrees() {
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

