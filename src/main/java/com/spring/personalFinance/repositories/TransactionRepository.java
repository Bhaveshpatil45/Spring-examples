package com.spring.personalFinance.repositories;

import com.spring.personalFinance.models.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {

    private List<Transaction> transactions = new ArrayList<>();

    // Simulate saving a transaction
    public void save(Transaction transaction) {
        transactions.add(transaction);
    }

    // Simulate retrieving transactions (could be filtered by user, etc.)
    public List<Transaction> findAll() {
        return transactions;
    }
}
