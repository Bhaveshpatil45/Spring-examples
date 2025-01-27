package com.spring.personalFinance.controllers;

import com.spring.personalFinance.models.User;
import com.spring.personalFinance.services.UserService;

import java.util.Scanner;

public class UserController {

    private UserService userService;

    // Constructor to inject the userService
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Controller method to create a user
    public void createUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Enter initial balance: ");
        double balance = scanner.nextDouble();

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setBalance(balance);

        userService.createUser(user);
        System.out.println("User " + username + " created with balance: " + balance);
    }

    // Controller method to update a user's balance
    public void updateUserBalance() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter amount to add/subtract: ");
        double amount = scanner.nextDouble();

        if (userService.updateUserBalance(username, amount)) {
            System.out.println("Balance updated for user " + username);
        } else {
            System.out.println("User not found. Balance not updated.");
        }
    }
}
