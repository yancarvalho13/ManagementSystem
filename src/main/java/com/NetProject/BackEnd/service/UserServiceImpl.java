package com.NetProject.BackEnd.service;

import com.NetProject.BackEnd.model.User;
import com.NetProject.BackEnd.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return  userRepository.findAll();
    }

    @Override
    public void addUser(User user) {
        this.userRepository.save(user);
    }



}
