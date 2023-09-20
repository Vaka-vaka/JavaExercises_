/**
 *  Using strings to control the switch instruction
 *
 * @author Valentyn Mozul
 * @version 1.0 from 01.11.2022
 */

package java.Herbert_Shield.chapter_5;

public class StringSwitch {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        String comand = "connect";

        switch(comand){
            case "connect":
                System.out.println("Пoдключeниe");
                break;
            case "cancel":
                System.out.println("Oтмeнa");
                break;
            case "disconnect":
                System.out.println("Oтключeниe");
                break;
            default:
                System.out.println("Heвepнaя команда!");
                break;
        }
    }
}
