package com.NetProject.BackEnd.service;

import com.NetProject.BackEnd.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    User getUserById(long id);

    void deleteUserById(long id);

    Page<User> findPaginated(int pageNo, int pageSize);
}
