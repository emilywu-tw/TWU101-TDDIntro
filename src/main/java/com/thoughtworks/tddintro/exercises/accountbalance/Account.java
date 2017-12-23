package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        // This function deposits the given amount into the account.
        balance += amount;
    }

    public void withdraw(int amount) {
        // This function attempts to decrement the balance by amount. If that results in a negative value,
        // the withdrawal will be denied.
        if (balance - amount < 0) {
            System.out.printf("You only have $%d in your account. Cannot withdraw $%d.%n", balance, amount);
        }
        else {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}
