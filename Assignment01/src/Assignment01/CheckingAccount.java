package Assignment01;


public class CheckingAccount extends BankAccount {
    private int overdraftFee;

    public boolean debit(int amount) {
        if (amount < 0)
            balance = amount - overdraftFee;

            return true;
    }

    public void setOverdraftFee(int overdraftFee) {
        overdraftFee = scan.nextInt();
    }

    public int getOverdraftFee() {
        return overdraftFee;
    }

    public void applyInterest() {
        double setInterest = balance * getInterestRate();

        if (balance > 0)
            balance += setInterest;
    }

    public String getAccountInfo() {
        return "Account type\t: Checking\n" +
                "Account #\t: " + getAccountNumber() + "\n" +
                "Balance\t: " + getBalance() + "\n" +
                "Interest rate\t: " + getInterestRate() + "\n";
    }
}
