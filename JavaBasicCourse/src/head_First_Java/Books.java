/**
 * demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.08.2023
 */

package head_First_Java;

public class Books {
    String title;
    String author;
}

class BooksTestDrive {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "Плоди Java";
        myBooks[1].title = "Java Гетсбі";
        myBooks[2].title = "Збірник рецептів по Java";

        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", avtor ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}