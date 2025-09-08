package Question_1;

public class Bank {
    private String accountHolderName;
    private String accountNumber;
    private double accountBalance;

    public Bank(String accountHolderName, String accountNumber, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void depositAmount(double amount) {
        accountBalance += amount;
    }

    public void withdrawAmount(double amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAmount() {
        System.out.println("Account Balance :-> " + accountBalance);
    }
}
