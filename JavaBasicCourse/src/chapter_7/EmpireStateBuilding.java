/**
 * Ліфт Empire State Building
 *
 * @author Valentyn Mozul
 * @version 1.0 from 01.02.2023
 */

package chapter_7;

import java.util.Scanner;

public class EmpireStateBuilding {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        DemoLogin demoLogin = new DemoLogin();

        System.out.println("Який поверх!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 1 || number > 102){
            System.out.println("невірний поверх");
        }else if(number > 39 && number < 102 || number < 24 && number > 0){
            System.out.println("ok");
        } else if (number >= 24 && number <= 39) {
            demoLogin.login();
        }
    }
}

class DemoLogin{
    void login(){
        System.out.println("Введіть логін");
        Scanner scanner = new Scanner(System.in);
        int login1 = scanner.nextInt();
        if(login1 == 1337){
            System.out.println("ok");
        }else {
            System.out.println("невірний пароль");
        }
    }
}
