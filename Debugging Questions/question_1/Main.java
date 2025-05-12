public class Main {
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        Customer customer1 = new Customer("John Doe", 1);
        Customer customer2 = new Customer("Jane Doe", 2);

        Account account1 = new Account(1, customer1);
        Account account2 = new Account(2, customer2);

        customer1.addAccount(account1);
        customer2.addAccount(account2);

        bankingSystem.addCustomer(customer1);
        bankingSystem.addCustomer(customer2);

        bankingSystem.addAccount(account1);
        bankingSystem.addAccount(account2);

        account1.deposit(1000.0);
        account2.deposit(500.0);

        Transaction transaction1 = new Transaction(100.0, account1);
        Transaction transaction2 = new Transaction(200.0, account2);

        bankingSystem.addTransaction(transaction1);
        bankingSystem.addTransaction(transaction2);

        bankingSystem.printCustomerAccounts(customer1);
        bankingSystem.printCustomerAccounts(customer2);

        bankingSystem.printAccountTransactions(account1);
        bankingSystem.printAccountTransactions(account2);
    }
}