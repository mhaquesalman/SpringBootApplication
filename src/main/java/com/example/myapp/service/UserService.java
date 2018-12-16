package com.example.myapp.service;

import com.example.myapp.model.Role;
import com.example.myapp.model.User;
import com.example.myapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
     @Autowired
     private UserRepository userRepository;

    public void createUser(User user) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        Role userRole = new Role("USER");
        List<Role> roles = new ArrayList<>();
        roles.add(userRole);
        user.setRoles(roles);
        userRepository.save(user);
    }

    public void createAdmin(User user) {
        BCryptPasswordEncoder  encoder = new  BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        Role userRole = new Role("ADMIN");
        List<Role> roles = new ArrayList<>();
        roles.add(userRole);
        user.setRoles(roles);
        userRepository.save(user);
    }

    public User findUser(String email) {
        return userRepository.getOne(email);
    }

   public boolean isUserPresent(String email) {
        // TODO Auto-generated method
      User u = userRepository.findById(email).orElse(null);
        if (u!=null)
            return true;

        return false;
    }

    public List<User> findAll() {
        // TODO Auto-generated method stub
        List<User> usersList = userRepository.findAll();
        return usersList;
    }

    public List<User> findByName(String name) {
        // TODO Auto-generated method stub
       return userRepository.findByNameLike("%"+name+"%");
    }




}
