/**
 * java basic
 * lesson 5
 *
 * @version 1.0 from 2023-12-12
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_5.home_work_;

public class MainBankAccount {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        System.out.println(BankAccount.getNumberOfAccount());
        BankAccount bankAccount = new BankAccount(1, "Iam", 500);
        BankAccount bankAccount1 = new BankAccount(2, "Nat", 1000);
        System.out.println(bankAccount1.toString());
        System.out.println(bankAccount.toString());


        bankAccount1.deposit(500);
        bankAccount.deposit(500);
        System.out.println(bankAccount1.toString());
        System.out.println(bankAccount.toString());

        bankAccount1.withdraw(1450);
        bankAccount.withdraw(900);
        System.out.println(bankAccount1.toString());
        System.out.println(bankAccount.toString());
        System.out.println(bankAccount.getNumberOfAccounts());
        System.out.println(BankAccount.getNumberOfAccount());
    }
}
