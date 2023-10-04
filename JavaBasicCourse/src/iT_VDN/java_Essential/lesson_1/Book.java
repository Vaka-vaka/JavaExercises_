/**
 * java basic
 * lesson 1
 *
 * @author Valentyn Mozul
 * @version 1.0 from 29.08.2023
 */

package iT_VDN.java_Essential.lesson_1;

public class Book {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Title title = new Title();
        title.setName("Христоносці");

        Author author = new Author();
        author.setName("Гаред Мувет");

        Content content = new Content();
        content.setContent("Історична книга");

        title.show();
        author.show();
        content.show();
    }
}
