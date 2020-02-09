package Assignment01;

public abstract class BankAccount {
    private String accountNumber;
    private double interestRate;
    private int balance;

    public boolean credit(int amount) {}

    public abstract boolean debit(int amount);

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        accountNumber = "0000-0000-0000-0000";
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate() { //interest is calculated
        double interest = balance * getInterestRate();
        double setInterest = balance + interest;
    }

    public abstract void applyInterest();

    public abstract String getAccountInfo();
}
