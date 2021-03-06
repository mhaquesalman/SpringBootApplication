package com.example.myapp.service;

import com.example.myapp.model.Task;
import com.example.myapp.model.User;
import com.example.myapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void addTask(Task task, User user) {
        task.setUser(user);
        taskRepository.save(task);
    }

    public List<Task> findUserTask(User user){

        return taskRepository.findByUser(user);
    }
}
