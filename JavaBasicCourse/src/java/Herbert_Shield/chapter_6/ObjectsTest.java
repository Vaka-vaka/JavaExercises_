/**
 * Objects are passed to methods by reference
 *
 * @author Valentyn Mozul
 * @version 1.0 from 16.11.2022
 */

package java.Herbert_Shield.chapter_6;

public class ObjectsTest {
    int a, b, c, volume;

    ObjectsTest(int u, int i, int h) {
        a = u;
        b = i;
        c = h;
        volume = a * b * c;
    }

    // Возврат логического значения true, если
    // параметр оЬ определяет тот же параллелепипед
    boolean sameObjectsTest(ObjectsTest ob) {
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    //Возврат логического значения true,
    // если параметр ob определяет параллелепипед того же объема
    boolean sameVolume(ObjectsTest ob) {
        return ob.volume == volume;
    }
}

class ObjectsTestDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ObjectsTest objectsTest1 = new ObjectsTest(2, 3, 4);
        ObjectsTest objectsTest2 = new ObjectsTest(2, 3, 4);
        ObjectsTest objectsTest3 = new ObjectsTest(2, 2, 6);

        System.out.println("objectsTest1 имеет те же размеры, что и objectsTest2 : "
                + objectsTest1.sameObjectsTest(objectsTest2));
        System.out.println("objectsTest2 имеет те же размеры, что и objectsTest3 : "
                + objectsTest2.sameObjectsTest(objectsTest3));
        System.out.println("objectsTest1 имеет тот же объем, что и objectsTest3 : "
                + objectsTest1.sameVolume(objectsTest3));
        System.out.println("objectsTest2 имеет тот же объем, что и objectsTest3 : "
                + objectsTest2.sameVolume(objectsTest3));
    }

}