package com.NetProject.BackEnd.controller;

import com.NetProject.BackEnd.model.User;
import com.NetProject.BackEnd.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home(Model model) {
        return "homepage";
    }

    @GetMapping("/userDB")
    public String userDb(Model model) {
        model.addAttribute("listUsers", userService.getAllUsers());

        return "userDB";
    }

    @GetMapping("/formNewUser")
    public String formNewUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "userRegister";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user, Model model) {
            userService.addUser(user);
            return "redirect:/userDB";

    }
}
