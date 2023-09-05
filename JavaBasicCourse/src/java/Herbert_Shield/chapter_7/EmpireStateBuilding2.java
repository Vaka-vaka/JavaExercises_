/**
 * Ліфт Empire State Building2
 *
 * @author Valentyn Mozul
 * @version 1.0 from 02.02.2023
 */

package java.Herbert_Shield.chapter_7;

import java.util.Scanner;

public class EmpireStateBuilding2 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {

        DemoLogin2 demoLogin2 = new DemoLogin2();

        System.out.println("Який поверх!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number >= 1 && number <= 102){
            if(number > 24 && number < 40){
                demoLogin2.login();
            }else {
                System.out.println("ok");
            }
        }else {
            System.out.println("невірний поверх");
        }

    }
}

class DemoLogin2{
    void login(){
        System.out.println("Введіть логін");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 1337){
            System.out.println("ok");
        }else {
            System.out.println("невірний пароль");
        }
    }
}