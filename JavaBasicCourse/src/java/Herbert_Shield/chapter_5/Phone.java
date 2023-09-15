/**
 * The simplest automated phone book
 *
 * @author Valentyn Mozul
 * @version 1.0 from 02.11.2022
 */

package java.Herbert_Shield.chapter_5;

public class Phone {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        String[][] abonent = {
                {"Mary", "222-344-33"},
                {"Dan", "333-44-55"},
                {"Kostya", "666-66-88"}
        };
        int i;

        //Для того чтобы воспользоваться программой, ей нужно передать один аргумент командной строки
        if (args.length != 1) {
            System.out.println("Иcпoльзoвaниe : java Phone <имя>");
        } else {
            for (i = 0; i < abonent.length; i++) {
                if (abonent[i][0].equals(args[0])) {
                    System.out.println(abonent[i][0] + ", number telephone = " + abonent[i][1]);
                    break;
                }
            }
            if (i == abonent.length) {
                System.out.println("Имя не найдено.");
            }
        }
    }
}
