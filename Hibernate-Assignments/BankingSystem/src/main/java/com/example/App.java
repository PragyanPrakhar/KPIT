package com.example;

import com.example.dao.AccountDAO;
import com.example.models.Account;
import com.example.services.TransactionService;

public class App {
    public static void main(String[] args) {
        AccountDAO accountDAO = new AccountDAO();
        TransactionService transactionService = new TransactionService();

        // Create new account
        Account account1 = new Account(5000.0);
        accountDAO.saveAccount(account1);
        System.out.println("New account created with ID: " + account1.getId());

        // Deposit money
        transactionService.deposit(account1.getId(), 1500.0);

        // Withdraw money
        transactionService.withdraw(account1.getId(), 1000.0);

        // Fetch account details
        Account fetchedAccount = accountDAO.getAccount(account1.getId());
        System.out.println("Final Balance: " + fetchedAccount.getBalance());
    }
}
