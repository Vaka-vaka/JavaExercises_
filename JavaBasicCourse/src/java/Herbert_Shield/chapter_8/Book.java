/**
 *
 * @author Valentyn Mozul
 * @version 1.0 from 07.02.2023
 */

package java.Herbert_Shield.chapter_8;

public class Book {
    private String title;
    private String author;
    private int pubDate;

    Book(String t, String a, int pD) {
        this.title = t;
        this.author = a;
        this.pubDate = pD;
    }

    void show() {
        System.out.println("title");
        System.out.println("author");
        System.out.println("pubDate");
        System.out.println();
    }

    
}

class DemoBook {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("Java : руководство для начинающих, 7-е издание", "Герберт Шилдт", 2018);
        books[1] = new Book("Java : полное руководство, 10-е издание", "Герберт Шилдт", 2018);
        books[2] = new Book("Искусство программирования на Java", "Герберт Шилдт", 2005);
        books[3] = new Book("Красный шторм поднимается", "Том Клэнси", 2006);
        books[4] = new Book("B дороге", "Джек Керуак", 2012);

        int i = 0;
        while (i < books.length){
            books[i].show();
            System.out.println(books[i]);
            i++;
        }
    }
}
