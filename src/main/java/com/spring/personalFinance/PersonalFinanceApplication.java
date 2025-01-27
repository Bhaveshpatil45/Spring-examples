package com.spring.personalFinance;

import com.spring.personalFinance.models.User;
import com.spring.personalFinance.services.TransactionService;
import com.spring.personalFinance.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PersonalFinanceApplication {
    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Get services from Spring context
        UserService userService = (UserService) context.getBean("userService");
        TransactionService transactionService = (TransactionService) context.getBean("transactionService");

        // Create a user
        User user = new User();
        user.setUsername("john_doe");
        user.setPassword("password123");
        user.setBalance(1000.00);
        userService.createUser(user);

        // Create a transaction
        transactionService.createTransaction(user, 500.00, "Salary payment");
    }
}
