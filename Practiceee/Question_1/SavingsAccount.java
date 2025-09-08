package Question_1;

public class SavingsAccount extends Bank {
    private double interestRate;

    public SavingsAccount(String accountHolderName, String accountNumber, double accountBalance, double interestRate) {
        super(accountHolderName, accountNumber, accountBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        if (getAccountBalance() > 0) { // Allow interest on positive balance only
            double interest = getAccountBalance() * interestRate / 100;
            setAccountBalance(getAccountBalance() + interest);
            System.out.println("Interest added: " + interest);
        } else {
            System.out.println("Interest cannot be added to zero or negative balance.");
        }
    }
}
