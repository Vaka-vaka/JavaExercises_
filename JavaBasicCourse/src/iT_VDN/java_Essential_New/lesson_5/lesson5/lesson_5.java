/**
 * java basic
 * lesson 5
 *
 * @version 1.0 from 2023-12-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_5.lesson5;

import static iT_VDN.java_Essential_New.lesson_5.lesson5.Season.*;

public class lesson_5 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
       String currentSeason = SPRING;
       String randomSeason = "asdlklad";
       printWeather(currentSeason);
        printWeather(randomSeason);
        printWeather1(Seasons.AUTUMN);
    }

    public static void printWeather(String season) {
        if (season.equals(SPRING)) {
            System.out.println("Тепло і сонячно");
        } else if (season.equals(SUMMER)) {
            System.out.println("Спекотно");
        } else if (season.equals(AUTUMN)) {
            System.out.println("Прохолодно і дощить");
        } else if (season.equals(WINTER)) {
            System.out.println("Холодно і сніжно");
        } else {
            System.out.println("Невідома пора року");
        }
    }

    public static void printWeather1 (Seasons seasons) {
        String seasonName = seasons.getName();
        switch (seasons){
            case SPRING:
                System.out.println(seasonName + ": Тепло і сонячно");
                break;
            case AUTUMN:
                System.out.println(seasonName + ": Прохолодно і дощить");
                break;
            case SUMMER:
                System.out.println(seasonName + ": Спекотно");
                break;
            case WINTER:
                System.out.println(seasonName + ": Холодно і сніжно");
                break;
            default:
                System.out.println("Невідома пора року");
                break;
        }
    }
}
