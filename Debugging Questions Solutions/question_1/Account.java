public class Account {
    private int id;
    private double balance;
    private Customer customer;

    public Account(int id, Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null.");
        }
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }   

    public synchronized void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public synchronized void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }
}