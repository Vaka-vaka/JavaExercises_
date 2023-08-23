/**
 * demo guess
 *
 * @author Valentyn Mozul
 * @version 1.0 from 22.08.2023
 */

package head_First_Java;

public class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, це число " + number + "говорить гравець");
    }
}
