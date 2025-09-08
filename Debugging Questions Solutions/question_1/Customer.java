import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int id;
    private List<Account> accounts;

    public Customer(String name, int id) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Customer name cannot be null or empty.");
        }
        this.name = name;
        this.id = id;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null.");
        }
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}