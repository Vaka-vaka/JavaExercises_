/**
 * @author Valentyn Mozul
 * @version 1.0 from 28.03.2023
 */

package JavaKids;

public class Counter {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        String[] players = {"Dima", "Fatima", "Kolay", "Roma"};
        int totalPlayers = players.length;
        int counter = 0;
//            while (counter < totalPlayers) {
//                if (counter == 3) {
//                    break;
//                }
//                String thePlayer = players[counter];
//                System.out.println("Congratulations, " + thePlayer + "!");
//                counter++;
//            }
        System.out.println("============================");
        while (counter < totalPlayers) {
            counter++;
            String thePlayer2 = players[counter];
            if (thePlayer2.equals("Dima")) {
                continue;
            }
            System.out.println("Congratulations 2, " + thePlayer2 + "!");

        }
    }
}
