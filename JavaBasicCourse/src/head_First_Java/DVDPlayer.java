/**
 * demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 23.08.2023
 */

package head_First_Java;

public class DVDPlayer {
    boolean canRecord = false;
    int count = 0;

    void dvdPlayer(){
        System.out.println("Музика грає");
    }

    void recordDVD() {
        System.out.println("Іде запис DVD");
    }
}

class DVDPlayerTestDrive {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {

        DVDPlayer player = new DVDPlayer();
        DVDPlayer player1 = new DVDPlayer();
        player.count = player.count + 1;
        System.out.println(player.count);
        System.out.println(player1.count);
        player.count = player.count + player1.count;
        System.out.println(player.count);

        player.canRecord = true;
        player.dvdPlayer();

        if (player.canRecord) {
            player.recordDVD();
        }
    }
}