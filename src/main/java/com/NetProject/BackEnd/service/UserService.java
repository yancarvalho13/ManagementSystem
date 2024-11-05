package com.NetProject.BackEnd.service;

import com.NetProject.BackEnd.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    User getUserById(long id);
}
