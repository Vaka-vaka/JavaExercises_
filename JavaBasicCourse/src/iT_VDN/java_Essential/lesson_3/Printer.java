/**
 * java basic
 * lesson 3
 *
 * @version 1.0 from 2023-09-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_3;

public class Printer {

    public final String[] color =
            {"\u001B[30m", "\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m"};
    public int colorLength;
    public int random;

    public void print(String value) {
        colorLength = color.length;
        random = (int) (Math.random() * colorLength);
        System.out.println(color[random] + value);
    }
}
