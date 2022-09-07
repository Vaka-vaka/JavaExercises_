/**
 * Calculation of the distance to the place where the lightning struck,
 * from which the sound reaches the observer after 7.2 seconds.
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_2;

public class Sound {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        double dist;
        double soundSpeed = 330;
        double timeLapse = 7.2;
        dist = soundSpeed * timeLapse;
        System.out.println("Paccтoяниe до места вспышки молнии" +
                " составляет " + dist + " метров.");
        double timeSpan_to_echo = 14.4;
        dist = (soundSpeed * timeSpan_to_echo) / 2;
        System.out.println("Paccтoяниe до скалы" +
                " составляет " + dist + " метров.");
    }
}
