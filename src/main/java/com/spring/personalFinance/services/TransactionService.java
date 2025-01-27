package com.spring.personalFinance.services;


import com.spring.personalFinance.models.Transaction;
import com.spring.personalFinance.models.User;

import java.util.Date;

public class TransactionService {

    public void createTransaction(User user, double amount, String description) {
        Transaction transaction = new Transaction();
        transaction.setDate(new Date());
        transaction.setAmount(amount);
        transaction.setDescription(description);
        transaction.setUser(user);

        // Simulate saving transaction and updating user's balance
        user.setBalance(user.getBalance() + amount);
        System.out.println("Transaction created: " + transaction.getDescription() + " with amount " + amount);
    }
}

