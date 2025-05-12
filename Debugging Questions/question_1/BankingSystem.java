import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BankingSystem {
    private List<Customer> customers;
    private List<Account> accounts;
    private List<Transaction> transactions;

    public BankingSystem() {
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void printCustomerAccounts(Customer customer) {
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer ID: " + customer.getId());
        customer.getAccounts().forEach(account -> {
            System.out.println("Account ID: " + account.getId());
            System.out.println("Account Balance: " + account.getBalance());
        });
    }

    public void printAccountTransactions(Account account) {
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }
        if (!accounts.contains(account)) {
            System.out.println("Account not found in the system.");
            return;
        }
        System.out.println("Account ID: " + account.getId());
        transactions.stream()
                .filter(transaction -> transaction.getAccount().getId() == account.getId())
                .forEach(transaction -> {
                    System.out.println("Transaction Amount: " + transaction.getAmount());
                });
    }
}