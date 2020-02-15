package Assignment01;


import Assignment01.BankAccount;

public class CreditcardAccount extends BankAccount {
    private int creditLimit;

    @Override
    public boolean debit(int amount) {
        boolean trueFalse = false; //used to return true or false
        this.balance -= creditLimit;
        creditLimit -= amount;
        if (creditLimit > 0) {
            trueFalse = true;
        }

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

        if (this.balance < 0)
            this.balance = ((int) (interest * this.balance) + this.balance);
    }

    public String getAccountInfo() {
        String formattedBalance = String.format("$%.2f", (double) getBalance()/100);
        String formattedInterestRate = String.format("%.2f", getInterestRate()*100);
        String formattedCreditLimit = String.format("$%.2f", (double) getCreditLimit()/100);
        return "Account type  : Creditcard\n" +
                "Account #     : " + getAccountNumber() + "\n" +
                "Balance       : " + formattedBalance + "\n" +
                "Interest rate : " + formattedInterestRate + "%" + "\n" +
                "Credit Limit  : " + formattedCreditLimit + "\n";
    }
}
