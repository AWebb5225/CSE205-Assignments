package Assignment01;

import java.util.Scanner;

public abstract class BankAccount {
    protected String accountNumber = "0000-0000-0000-0000";
    protected double interestRate;
    protected int balance;

    Scanner scan = new Scanner(System.in);

    public boolean credit(int amount) {

    }

    public abstract boolean debit(int amount);

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber() {
        accountNumber = scan.nextLine();
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate() {
        interestRate = scan.nextDouble();
    }

    public abstract void applyInterest();

    public abstract String getAccountInfo();
}
