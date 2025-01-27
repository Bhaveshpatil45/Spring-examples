package com.spring.personalFinance.repositories;



import com.spring.personalFinance.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    // Simulate saving a user
    public void save(User user) {
        users.add(user);
    }

    // Simulate finding a user by username
    public Optional<User> findByUsername(String username) {
        return users.stream().filter(user -> user.getUsername().equals(username)).findFirst();
    }

    // Simulate updating a user
    public void update(User user) {
        // This is a simple example, so we'll just replace the user by username
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(user.getUsername())) {
                users.set(i, user);
            }
        }
    }
}
