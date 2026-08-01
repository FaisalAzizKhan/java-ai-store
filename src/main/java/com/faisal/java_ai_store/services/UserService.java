package com.faisal.java_ai_store.services;

import java.util.ArrayList;
import java.util.List;

import com.faisal.java_ai_store.models.User;

public class UserService {
    
    private final List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return users;
    }
    public User getUserById(Long users_id) {
        return users.stream()
                .filter(user -> user.getUsers_id().equals(users_id))
                .findFirst()
                .orElse(null);
    }
    public User createUser(User user) {
        users.add(user);
        return user;
    }

    public User updateUser(Long users_id, User updatedUser) {

        User user = getUserById(users_id);

        if (user != null) {
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            user.setPassword(updatedUser.getPassword());
        }

        return user;
    }



}
