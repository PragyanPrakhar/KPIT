package com.example.services;

import com.example.dao.AccountDAO;
import com.example.models.Account;

public class TransactionService {
    private AccountDAO accountDAO = new AccountDAO();

    public void deposit(int accountId, double amount) {
        Account account = accountDAO.getAccount(accountId);
        if (account != null) {
            account.setBalance(account.getBalance() + amount);
            accountDAO.updateAccount(account);
            System.out.println("Deposited " + amount + ". New balance: " + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdraw(int accountId, double amount) {
        Account account = accountDAO.getAccount(accountId);
        if (account != null) {
            if (account.getBalance() >= amount) {
                account.setBalance(account.getBalance() - amount);
                accountDAO.updateAccount(account);
                System.out.println("Withdrawn " + amount + ". New balance: " + account.getBalance());
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Account not found!");
        }
    }
}
