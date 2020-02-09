package Assignment01;

public class SavingsAccount extends BankAccount {
int balance = getBalance();

//checks if the savings account has enough funds
    public boolean debit(int amount) {
        boolean trueFalse = true;

        if (balance < 0)
            trueFalse = false;

        return trueFalse;
    }

    //applies the interest rate to the savings account
    public void applyInterest() {
        double interest = getInterestRate();
        balance *= interest;
    }

    //returns all of the information for the savings account
    public String getAccountInfo() {
        return System.out.print("Account type\t: Checking\n" +
                                "Account #\t: " + getAccountNumber() + "\n" +
                                "Balance\t: " + getBalance() + "\n" +
                                "Interest rate\t: " + getInterestRate() + "\n");
    }
}
