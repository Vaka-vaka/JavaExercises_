/**
 * java basic
 * lesson 4
 * homeWork_3
 *
 * @version 1.0 from 2023-09-27
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_4.homeWork_2;

public class MainPlayer {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Player player = new Player();
        player.play();
        player.pause();
        player.record();
        player.stop();
    }
}
