package com.example.myapp.controller;

import com.example.myapp.model.User;
import com.example.myapp.service.TaskService;
import com.example.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class ProfileController {
    @Autowired
    private TaskService taskService;
    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public String showProfilePage(Model model, Principal principal) {
        String email = principal.getName();
        User user = userService.findUser(email);
        model.addAttribute("tasks", taskService.findUserTask(user));
        return "views/profile";
    }
}
