package Assignment01;

import java.text.DecimalFormat;

public abstract class BankAccount {

    protected String accountNumber = "0000-0000-0000-0000"; //sets default account number
    protected double interestRate;
    protected int balance;

    public boolean credit(int amount) {
        balance += amount;
        return true;
    }

    public abstract boolean debit(int amount);

    public int getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public abstract void applyInterest();

    public abstract String getAccountInfo();
}
