package com.example.myapp;

import com.example.myapp.model.User;
import com.example.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyappApplication implements CommandLineRunner{
	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}


    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        {
            User newAdmin = new User("Admin", "admin@gmail.com", "123456");
            userService.createAdmin(newAdmin);
        }
    }


}
