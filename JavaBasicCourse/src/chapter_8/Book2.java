/**
 * Declaring protected instance variables in the Book class
 *
 * @author Valentyn Mozul
 * @version 1.0 from 08.02.2023
 */

package chapter_8;

public class Book2 {

    protected String title;
    protected String author;
    protected int pubDate;

    Book2(String t2, String a2, int pD2) {
        this.title = t2;
        this.author = a2;
        this.pubDate = pD2;
    }

    public void show() {
        System.out.println("title");
        System.out.println("author");
        System.out.println("pubDate");
    }
}

class ExtBook extends Book2 {
    private String publisher;

    ExtBook(String t2, String a2, int pD2, String p) {
        super(t2, a2, pD2);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println("publisher");
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher1) {
        this.publisher = publisher1;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public void setAuthor(String a) {
        this.author = a;
    }

    public void setPubDate(int pd) {
        this.pubDate = pd;
    }
}

class ProtectedDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ExtBook[] extBook = new ExtBook[5];

        extBook[0] = new ExtBook
                ("Java : руководство для начинающих, 7-е издание", "Герберт Шилдт", 2018, "Вильямс");
        extBook[1] = new ExtBook
                ("Java : полное руководство, 10-е издание", "Герберт Шилдт", 2018, "Вильямс");
        extBook[2] = new ExtBook
                ("Искусство программирования на Java", "Герберт Шилдт", 2005, " Диалектика");
        extBook[3] = new ExtBook
                ("Красный шторм поднимается", "Том Клэнси", 2006, "Эксмо");
        extBook[4] = new ExtBook
                ("B дороге", "Джек Керуак", 2012, "Азбука");

        for (int i = 0; i < extBook.length; i++) extBook[i].show();
        System.out.println();
        //Поиск книг по автору
        System.out.println("Bce книги Герберта Шилдта.");

        for (int a = 0; a < extBook.length; a++) {
            if (extBook[a].getAuthor() == "Герберт Шилдт") {
                System.out.println("author " + extBook[a].getAuthor());
                System.out.println("--------------------");
                System.out.println("title " + extBook[a].getTitle());
                System.out.println("--------------------");
                System.out.println("pubDate " + extBook[a].getPubDate());
                System.out.println("--------------------");
                System.out.println("publisher " + extBook[a].getPublisher());
            }
        }
    }
}