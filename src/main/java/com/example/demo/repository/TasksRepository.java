package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.model.Tasks;

public interface TasksRepository extends MongoRepository<Tasks, String> {
    
}
