package com.example.myapp.repository;

import com.example.myapp.model.Task;
import com.example.myapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser(User user);
}
