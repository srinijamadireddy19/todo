package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import com.example.demo.service.TasksService;
import com.example.demo.model.Tasks;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/tasks")
public class TaskController {
    
    @Autowired
    private TasksService tasksService;

    @PostMapping
    private Tasks createTask(@RequestBody Tasks task) {
        return tasksService.createTask(task);
    }

    @GetMapping
    public List<Tasks> viewTasks() {
        return tasksService.viewTasks();
    }

    @DeleteMapping("/{id}")
    public void deleteTasks(@PathVariable String id) {
        tasksService.deleteTask(id);
    }    

    

}
