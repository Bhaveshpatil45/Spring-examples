package com.spring.personalFinance.controllers;

import com.spring.personalFinance.services.TransactionService;
import com.spring.personalFinance.models.User;

import java.util.Scanner;

public class TransactionController {

    private TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    // Controller method to create a transaction
    public void createTransaction(User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter transaction amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter transaction description: ");
        String description = scanner.nextLine();

        transactionService.createTransaction(user, amount, description);
    }
}
