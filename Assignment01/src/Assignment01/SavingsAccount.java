
import Assignment01.BankAccount;

public class SavingsAccount extends BankAccount {

//checks if the savings account has enough funds
    @Override
     public boolean debit(int amount) {
        boolean trueFalse = false; //used to return true or false

         if (this.balance > amount) {
             this.balance -= amount;
             trueFalse = true;
        }
        else if (this.balance < amount)
            trueFalse = false;

        return trueFalse;
    }

    //applies the interest rate to the savings account
    public void applyInterest() {
         double interest = getInterestRate();
        this.balance = ((int) (interest * this.balance) + this.balance);
    }

    //returns all of the information for the savings account
    public String getAccountInfo() {
         String formattedInterestRate = String.format("%.2f", interestRate*100);
         String formattedBalance = String.format("$%.2f", (double) balance/100);

        return "Account type  : Savings\n" +
                "Account #     : " + getAccountNumber() + "\n" +
                "Balance       : " + formattedBalance  + "\n" +
                "Interest rate : " + formattedInterestRate + "%\n";
    }
}
