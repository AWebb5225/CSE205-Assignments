package Assignment01;

public class CheckingAccount extends BankAccount {
    private int overdraftFee;

    @Override
    public boolean debit(int amount) {
       this.balance = getBalance();

       if (this.balance < 0){
            balance -= getOverdraftFee();
            balance /= 100;
        }

        return true;
    }

    public void setOverdraftFee(int overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    public int getOverdraftFee() {
        return this.overdraftFee;
    }

    public void applyInterest() {
        double interest = getInterestRate();

        if (this.balance > 0)
            this.balance = ((int) (interest * this.balance) + this.balance);
    }

    public String getAccountInfo() {
        //formats the balance and interest rate
        String formattedInterestRate = String.format("%.2f", interestRate*100);
        String formattedBalance = String.format("$%.2f", (double) balance/100);
        String formattedOverdraftFee = String.format("$%.2f", (double) getOverdraftFee()/100);

        return "Account type  : Checking\n" +
                "Account #     : " + getAccountNumber() + "\n" +
                "Balance       : " +  formattedBalance + "\n" +
                "Interest rate : " + formattedInterestRate  + "%" + "\n" +
                "Overdraft fee : " + formattedOverdraftFee;
    }
}
