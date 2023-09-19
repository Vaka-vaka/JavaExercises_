/**
 * Introduction to the String class
 *
 * @author Valentyn Mozul
 * @version 1.0 from 24.10.2022
 */

package java.Herbert_Shield.chapter_5;

public class StringDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        // Различные способы объявления строк
        String str1 = new String(" B Java строки - это объекты.");
        String str3 = "Их можно создавать разными способами.";
        String str2 = new String(str1);
        String str4 = new String(str3);

        System.out.println(str1);
        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str4);
    }
}
