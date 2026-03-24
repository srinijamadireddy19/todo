package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.demo.repository.TasksRepository;
import com.example.demo.model.Tasks;

@Service
public class TasksService {
    
    @Autowired
    private TasksRepository tasksRepository;

    public Tasks createTask(Tasks task) {
        return tasksRepository.save(task);
    }

    public List<Tasks> viewTasks() {
        return tasksRepository.findAll();
    }

    public void deleteTask(String id) {
        tasksRepository.deleteById(id);
    }

}
