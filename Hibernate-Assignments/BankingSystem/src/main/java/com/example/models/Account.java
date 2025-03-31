package com.example.models;

import jakarta.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private double balance;

    public Account() {}

    public Account(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    @PreUpdate
    public void logBalanceChange() {
        System.out.println("Balance updated: " + balance);
    }
}
