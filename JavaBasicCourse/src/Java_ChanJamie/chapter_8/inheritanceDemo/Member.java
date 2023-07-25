/**
 * demo inheritance
 *
 * @author Valentyn Mozul
 * @version 1.0 from 20.07.2023
 */

package Java_ChanJamie.chapter_8.inheritanceDemo;

import java.util.Scanner;

abstract public class Member {
        //Первое — открытое поле для хранения приветственного
        //сообщения. Оно инициализируется строкой «Welcome
        //to ABC Fitness».
        public String welcome = "Welcome to ABC Fitness";
        protected double annualFee;
        private String name;
        private int memberId;
        private int memberSince;
        private int discount;

        public Member() {
                System.out.println("Parent Constructor with no parameter");
        }

        public Member(String pName, int pMemberID, int pMemberSince) {
                System.out.println("Parent Constructor with 3 parameters");

                name = pName;
                memberId = pMemberID;
                memberSince = pMemberSince;
        }

        // Get-метод просто возвращает значение поля discount.
        public double getDiscount() {
                return discount;
        }

        // Set-метод более сложен. Он требует, чтобы пользователь
        //ввел пароль администратора, прежде чем он сможет отредактировать поле discount.
        public void setDiscount() {
                Scanner scanner = new Scanner(System.in);
                String password;
                System.out.println("Please enter the admin password: ");
                password = scanner.nextLine();

                if (!password.equals("abcd")) {
                        System.out.println("Invalid password. You do not have authority to edit the discount.");
                } else {
                        System.out.println("Please enter the discount: ");
                        discount = scanner.nextInt();
                }
        }

        // Он использует серию команд println() для вывода информации о посетителе клуба
        public void displayMemInfo() {
                System.out.println("Member name: " + name);
                System.out.println("Member ID: " + memberId);
                System.out.println("Member Since: " + memberSince);
                System.out.println("Annual Fee: " + annualFee);
        }

        //Он будет использован для вычисления размера
        //ежегодной оплаты для посетителя клуба
        abstract public void calculateAnnualFee();
}
