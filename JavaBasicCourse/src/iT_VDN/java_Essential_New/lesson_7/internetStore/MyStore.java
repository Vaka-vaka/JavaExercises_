/**
 * internet store
 *
 * @version 1.0 from 2024-01-02
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.internetStore;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MyStore {
    private List<Product> products = new ArrayList<>();

    public MyStore() {
        products.add(new Product("iPhone 14", 1000));
        products.add(new Product("Samsung Galaxy S23", 900));
        products.add(new Product("MacBook Pro 2023", 2000));
    }

    public void showProducts() throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        out.println("<html>");
        out.println("<head>");
        out.println("<title>My Store</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>My Store</h1>");
        for (Product product : products) {
            out.println("<p>");
            out.println("<strong>" + product.getName() + "</strong>");
            out.println("$" + product.getPrice());
            out.println("</p>");
        }
        out.println("</body>");
        out.println("</html>");
        out.flush();
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
        MyStore store = new MyStore();
        store.showProducts();
    }
}
