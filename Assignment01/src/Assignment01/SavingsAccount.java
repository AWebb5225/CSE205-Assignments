package Assignment01;

public class SavingsAccount extends BankAccount {

//checks if the savings account has enough funds
    public boolean debit(int amount) {
        boolean trueFalse = true; //used to return true or false

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
        return "Account type\t: Savings\n" +
                                "Account #\t: " + getAccountNumber() + "\n" +
                                "Balance\t: " + getBalance() + "\n" +
                                "Interest rate\t: " + getInterestRate() + "\n";
    }
}
