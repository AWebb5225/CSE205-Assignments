package Assignment01;



public class CheckingAccount extends BankAccount {
    private int overdraftFee;

    @Override
    public boolean debit(int amount) {
        if (amount < 0)
            this.balance = amount - overdraftFee;

            return true;
    }

    public void setOverdraftFee(int overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    public int getOverdraftFee() {
        return this.overdraftFee;
    }

    public void applyInterest() {
        double setInterest = this.balance * getInterestRate();

        if (this.balance > 0)
            balance += setInterest;
    }

    public String getAccountInfo() {
        return "Account type   : Checking\n" +
                "Account #     : " + getAccountNumber() + "\n" +
                "Balance       : " + getBalance() + "\n" +
                "Interest rate : " + getInterestRate() + "\n";
    }
}
