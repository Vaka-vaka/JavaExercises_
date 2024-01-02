/**
 * java basic
 * lesson 5
 *
 * @version 1.0 from 2023-12-12
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_5.home_work_;

public class BankAccount {
    private static int numberOfAccounts = 0;
    public static final int MAX_WITHDRAWAL_LIMIT = 2000;
    private int accountId;
    private String accountHolder;
    private int balance;

    public BankAccount(int accountId, String accountHolder, int balance) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.balance = balance;
        numberOfAccounts++;
    }

    public static int getNumberOfAccount() {
        return numberOfAccounts;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void deposit(int dep) {
        balance += dep;
    }

    public void withdraw(int draw) {
        if (draw <= MAX_WITHDRAWAL_LIMIT) {
            balance -= draw;
        } else {
            System.out.println("Exception draw > MAX_WITHDRAWAL_LIMIT");
        }
    }

    @Override
    public String toString() {
        return getAccountId() + ", " + getAccountHolder() + ", " + getBalance();
    }
}
