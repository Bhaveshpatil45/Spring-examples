package com.spring.personalFinance.services;

import com.spring.personalFinance.models.User;
import com.spring.personalFinance.repositories.UserRepository;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create a new user
    public void createUser(User user) {
        userRepository.save(user);
    }

    // Update a user's balance
    public boolean updateUserBalance(String username, double amount) {
        User user = userRepository.findByUsername(username)
                .orElse(null); // Return null if user not found

        if (user != null) {
            user.setBalance(user.getBalance() + amount);
            userRepository.update(user);
            return true; // Successfully updated
        }
        return false; // User not found
    }

    // Get user by username
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElse(null); // Return null if user not found
    }
}
