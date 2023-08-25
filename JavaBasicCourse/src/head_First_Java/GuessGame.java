/**
 * demo guess
 *
 * @author Valentyn Mozul
 * @version 1.0 from 22.08.2023
 */

package head_First_Java;

public class GuessGame {
    // Три перемінні для 3 обєктів Player
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        // Робимо 3 обєкта Player, які дорівнюють 3 перемінним оригінала
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // Оголошуємо 3 перемінні для зберігання варіантів відповідей гравця
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // Оголошуємо 3 перемінні для зберігання (true and false) відповідей гравця
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        // Придумаємо число, яке гравці повинні вгадати
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я задумую число від 0 до 9...");

        while (true) {
            System.out.println("Число, яке потрібно вгадати - " + targetNumber);

            // Витягуємо метод guess() з кожного обєкта Player
            p1.guess();
            p2.guess();
            p3.guess();

            // Витягуємо варіанти кожного гравця
            guessp1 = p1.number;
            System.out.println("Перший гравець думає, що це " + guessp1);
            guessp2 = p2.number;
            System.out.println("Другий гравець думає, що це " + guessp2);
            guessp3 = p3.number;
            System.out.println("Третій гравець думає, що це " + guessp3);

            // Перевіряємо варіанти відповідей гравців
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {

                System.out.println("У нас є переможець!");
                System.out.println("Перший гравець вгадав?" + p1isRight);
                System.out.println("Другий гравець вгадав?" + p2isRight);
                System.out.println("Третій гравець вгадав?" + p3isRight);
                System.out.println("Кінець гри.");
                break;
            } else {
                System.out.println("Гравці, повинні спробувати ще...");
            }
        }
    }
}
