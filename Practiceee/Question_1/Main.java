package Question_1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("John Doe", "1234567890", 1000.00);
        bank.depositAmount(500);
        bank.displayAmount();
        bank.setAccountBalance(100000);
        bank.withdrawAmount(2000);
        bank.displayAmount();
        SavingsAccount savingsAccount = new SavingsAccount("Jane Doe", "0987654321", 1000.00, 5.0);
        savingsAccount.addInterest();
        savingsAccount.displayAmount();
        CurrentAccount currentAccount = new CurrentAccount("John Smith", "1357924680", 1000.00, 500.00);
        currentAccount.withdrawAmount(2000);
        currentAccount.displayAmount();
    }


}
