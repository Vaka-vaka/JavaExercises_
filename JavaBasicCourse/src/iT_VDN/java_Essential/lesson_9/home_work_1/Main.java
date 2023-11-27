/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2023-11-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_9.home_work_1;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal("Barsik", 2, true);
        System.out.println(animal);
        Animal animal1 = new Animal("Barsik", 2, false);
        System.out.println(animal1);
        Animal animal2 = new Animal("Barsik", 2, true);
        System.out.println(animal2);

        System.out.println(animal.equals(animal1));
        System.out.println("Animal = " + animal.hashCode() + "\nAnimal1 = " + animal1.hashCode());
        System.out.println(animal.equals(animal2));
        System.out.println("Animal = " + animal.hashCode() + " " + "\nAnimal2 = " + animal2.hashCode());

        System.out.println("++++++++++++++++==========================");
        Animal_IT_VDN animal_it_vdn = new Animal_IT_VDN("Barsik", 2, true);
        System.out.println(animal_it_vdn);
        Animal_IT_VDN animal1_ = new Animal_IT_VDN("Barsik", 2, false);
        System.out.println(animal1_);
        Animal_IT_VDN animal2_ = new Animal_IT_VDN("Barsik", 2, true);
        System.out.println(animal2_);

        System.out.println(animal_it_vdn.equals(animal1_));
        System.out.println("Animal_IT_VDN = " + animal_it_vdn.hashCode() + "\nAnimal1 = " + animal1_.hashCode());
        System.out.println(animal_it_vdn.equals(animal2_));
        System.out.println("Animal_IT_VDN = " + animal_it_vdn.hashCode() + " " + "\nAnimal2 = " + animal2_.hashCode());
    }
}
