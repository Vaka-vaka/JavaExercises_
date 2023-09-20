/**
 * Using the substring method ()
 *
 * @author Valentyn Mozul
 * @version 1.0 from 28.10.2022
 */

package java.Herbert_Shield.chapter_5;

public class SubStr {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        String orgstr = "Java - двигатель Интернета.";

        //Сформировать подстроку

        String substr = orgstr.substring(7, 26);

        System.out.println("orgstr : " + orgstr);
        System.out.println("substr : " + substr);
    }
}
