package Assignment01;


public class CreditcardAccount extends BankAccount {
    private int creditLimit;

    @Override
    public boolean debit(int amount) {
        boolean trueFalse = true;

        if (this.balance > amount)
            trueFalse = false;

        return trueFalse;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }

    public void applyInterest() {
        double interest = getInterestRate();
        double balance = getBalance();
        double setInterest = balance * interest;

        if (this.balance < 0)
            this.balance += setInterest;
    }

    public String getAccountInfo() {
        return "Account type   : Checking\n" +
                "Account #     : " + getAccountNumber() + "\n" +
                "Balance       : " + getBalance() + "\n" +
                "Interest rate : " + getInterestRate() + "\n";
    }
}
