/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-11-22
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_2.home_work;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Product[] product = new Product[3];
        product[0] = new Product("beer", 45.55);
        product[1] = new Product("milk", 43.30);
        product[2] = new Product("bread", 23.22);

        for (int i = 0; i < product.length; i++) {
            double discount = product[i].applyDiscount(15);
            System.out.println("Без знижки");
            System.out.println(product[i].getName() + " = " + product[i].getPrice());
            System.out.println("Із знижкою");
            System.out.println(product[i].getName() + " = " + discount);
        }
    }
}
