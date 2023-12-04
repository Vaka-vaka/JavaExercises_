/**
 * java basic
 * lesson 2
 *
 * @version 1.0 from 2023-11-23
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_2.home_work2;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        User[] user = new User[3];
        user[0] = new User("Vaka", 50, "Fala@ukr.net");
        user[1] = new User("Caka", 20, "Cala@ukr.net");
        user[2] = new User("Faka", 30, "Dala@ukr.net");

        for (int i = 0; i < user.length; i++) {
            System.out.println(user[i].getName() +
                    ", " + user[i].getAge() +
                    ", " + user[i].getEmail());
        }

        System.out.println("_____________--------------______________");

        User[] user1 = new User[5];
        Integer[] integersA = {50, 55, 23, 24, 44};
        String[] stringsN = {"Vaka", "Saka", "Daka", "Naka", "Maka"};
        String[] stringsEm = {"Dala@ukr.net", "Sala@ukr.net", "Fala@ukr.net",
                "Cala@ukr.net", "Hala@ukr.net"};

        for (int i = 0; i < user1.length; i++) {
            user1[i] = new User(stringsN[i], integersA[i], stringsEm[i]);
        }

        for (User value : user1) {
            System.out.println(value.getName() +
                    ", " + value.getAge() +
                    ", " + value.getEmail());
        }
    }
}
