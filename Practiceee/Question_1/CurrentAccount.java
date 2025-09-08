package Question_1;

public class CurrentAccount extends Bank {
    private double overdraftLimit;

    public CurrentAccount(String accountHolderName, String accountNumber, double accountBalance, double overdraftLimit) {
        super(accountHolderName, accountNumber, accountBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdrawAmount(double amount) {
        if (getAccountBalance() + overdraftLimit >= amount) {
            setAccountBalance(getAccountBalance() - amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    
}
