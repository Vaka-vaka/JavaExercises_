/**
 * java basic
 * lesson 6
 *
 * @version 1.0 from 2023-12-19
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_6.home_work_;

public class MainElectronicsStores {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ElectronicsStores electronicsStores = new ElectronicsStores();
        electronicsStores.addProduct(new Product(0, "banana", 17.3, 100));
        electronicsStores.addProduct(new Product(1, "mango", 22.3, 150));
        electronicsStores.listProducts();
        electronicsStores.findProductById(1);
    }
}
