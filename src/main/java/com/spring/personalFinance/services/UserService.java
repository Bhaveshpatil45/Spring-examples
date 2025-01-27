package com.spring.personalFinance.services;

import com.spring.personalFinance.models.User;

public class UserService {

    public void createUser(User user) {
        // Simulate user creation
        System.out.println("User " + user.getUsername() + " created with balance: " + user.getBalance());
    }

    public void updateUserBalance(User user, double amount) {
        // Simulate updating user balance
        user.setBalance(user.getBalance() + amount);
        System.out.println("User balance updated. New balance: " + user.getBalance());
    }
}

