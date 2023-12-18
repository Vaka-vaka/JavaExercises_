/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-10
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.bird;

public class Strauss extends Bird {

    Strauss(int weight) {
        super(weight); // super constructor base class
    }

    @Override
    void move() {
        System.out.println("Run");
    }
}
