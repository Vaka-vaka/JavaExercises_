/**
 * java basic
 * lesson 6
 *
 * @version 1.0 from 2023-12-19
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_6.home_work_;

import java.util.ArrayList;

public class ElectronicsStores {
        ArrayList<Product> productArrayList = new ArrayList<>();

    public void addProduct(Product product) {
        productArrayList.add(new Product(product.getProductId(), product.getProductName(),
                product.getPrice(), product.getQuantity()));

    }

    public void listProducts() {
        int size = productArrayList.size();
        System.out.println("size = " + size);
        String string = productArrayList.toString();
        System.out.println("tostring = " + string);
    }

    public void findProductById(int productId) {
        Product ind = productArrayList.get(productId);
        System.out.println(ind);
    }
}

