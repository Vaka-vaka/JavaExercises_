/**
 * java advanced
 * lesson 1
 *
 * @version 1.0 from 2023-11-16
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_1.ex_001_foreach.foreach;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Animal cat = new Animal("Spynx", 4000);
        Animal dog = new Animal("Spaniel", 1000);
        Animal bird = new Animal("Crow", 2000);

        Animal[] arr = {cat, dog, bird};

        for (int i = 0; i < arr.length; i++) {

        }

        for (Animal tpx : arr) {
            tpx.price = tpx.price + 1000; // Возможно изменение полей объекта
            tpx = new Animal("Lion", 40000); // Нельзя поменять объекты в массиве
        }

        for (Animal tpx : arr) {
            System.out.println(tpx.breed + ", " + tpx.price);
        }
    }
}
