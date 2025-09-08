public class Transaction {
    private double amount;
    private Account account;

    public Transaction(double amount, Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Transaction must be associated with an account.");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Transaction amount must be positive.");
        }
        this.amount = amount;
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public Account getAccount() {
        return account;
    }
}