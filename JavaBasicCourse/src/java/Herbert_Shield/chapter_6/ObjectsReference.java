/**
 * Objects are passed to methods by reference
 *
 * @author Valentyn Mozul
 * @version 1.0 from 16.11.2022
 */

package java.Herbert_Shield.chapter_6;

public class ObjectsReference {
    int a, b, sum;

    ObjectsReference(int i, int j) {
        a = i;
        b = j;
        sum = i * j;
    }

    //Передача объекта методу. Теперь переменные оЬ.а и оЬ.Ь
    //объекта, используемого при вызове, также будут изменяться
    void change(ObjectsReference ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
        ob.sum = ob.a * ob.b;
    }
}

class ObjectReference {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ObjectsReference reference = new ObjectsReference(15, 20);
        System.out.println("objectsReference.a и objectsReference.b перед вызовом : " + reference.a + " " + reference.b);

        System.out.println(reference.sum);

        reference.change(reference);
        System.out.println("objectsReference.a и objectsReference.b после вызова : " +
                reference.a + " " + reference.b);
        System.out.println(reference.sum);
    }
}
