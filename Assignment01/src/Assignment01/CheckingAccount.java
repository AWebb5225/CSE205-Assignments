package Assignment01;

public class CheckingAccount extends BankAccount {
    private int overdraftFee;
    int balance = getBalance();



    public boolean debit(int amount) {
        return true;
    }

    //checks if the balance is less than zero and if it is then it adds an overdraft fee
    public void setOverdraftFee(int overdraftFee) {
        if (balance < 0)
            balance += overdraftFee;
    }

    public void applyInterest() {
        double interest = getInterestRate();
        if (balance > 0)

    }

    public String getAccountInfo() {}

}
