package com.spring.personalFinance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.personalFinance.models.User;
import com.spring.personalFinance.controllers.UserController;
import com.spring.personalFinance.controllers.TransactionController;
import com.spring.personalFinance.services.UserService;
import com.spring.personalFinance.services.TransactionService;

import java.util.Scanner;

public class PersonalFinanceApplication {

    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Get services from Spring context
        UserService userService = (UserService) context.getBean("userService");
        TransactionService transactionService = (TransactionService) context.getBean("transactionService");

        // Create controllers
        UserController userController = new UserController(userService);
        TransactionController transactionController = new TransactionController(transactionService);

        // Simulate a simple user flow
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Create user");
            System.out.println("2. Update user balance");
            System.out.println("3. Create transaction");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            switch (choice) {
                case 1:
                    userController.createUser();
                    break;
                case 2:
                    userController.updateUserBalance();
                    break;
                case 3:
                    System.out.println("Enter the username to associate the transaction with:");
                    String username = scanner.nextLine();
                    User user = userService.getUserByUsername(username); // Fetch the user by username
                    if (user != null) {
                        transactionController.createTransaction(user);
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
