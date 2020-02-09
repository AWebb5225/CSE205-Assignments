package Assignment01;

public class CreditcardAccount extends BankAccount{
    private int creditLimit;

    public boolean debit(int amount) {
        double balance = getBalance();
        boolean trueFalse = true;

        if (balance > getCreditLimit())
            trueFalse = false;

        return trueFalse;
    }

    public void setCreditLimit() {
        creditLimit = scan.nextInt();
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void applyInterest() {
        double interest = getInterestRate();
        double balance = getBalance();
        double setInterest = balance * interest;

        if (balance < 0)
            balance += setInterest;
    }

    public String getAccountInfo() {
        return "Account type\t: Creditcard\n" +
                "Account #\t: " + getAccountNumber() + "\n" +
                "Balance\t: " + getBalance() + "\n" +
                "Interest rate\t: " + getInterestRate() + "\n";
    }
}
